import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Random;

public class GuessNumberWebServer {
    private static int numberToGuess;
    
    public static void main(String[] args) throws IOException {
        numberToGuess = new Random().nextInt(100) + 1;
        System.out.println("Number to guess: " + numberToGuess);
        
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/guess", new GuessHandler());
        server.createContext("/", new StaticHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server started on http://localhost:8000");
    }
    
    static class GuessHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            int guess = 0;
            if (query != null && query.startsWith("number=")) {
                try {
                    guess = Integer.parseInt(query.substring(7));
                } catch (NumberFormatException e) {
                    // ignore invalid input
                }
            }
            
            String response;
            if (guess == 0) {
                response = "Please provide a number between 1 and 100";
            } else if (guess < numberToGuess) {
                response = "Too low!";
            } else if (guess > numberToGuess) {
                response = "Too high!";
            } else {
                response = "Correct! You guessed it!";
                // reset game
                numberToGuess = new Random().nextInt(100) + 1;
                System.out.println("New number to guess: " + numberToGuess);
            }
            
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
    
    static class StaticHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            String html = """
                <!DOCTYPE html>
                <html>
                <head>
                <title>Guess Number Game</title>
                <style>
                    body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }
                    input, button { font-size: 1.2em; padding: 5px; }
                    #result { margin-top: 20px; font-weight: bold; }
                </style>
                </head>
                <body>
                <h1>Guess the Number (1-100)</h1>
                <input id="guessInput" type="number" min="1" max="100" placeholder="Your guess"/>
                <button onclick="submitGuess()">Guess</button>
                <div id="result"></div>
                <script>
                    function submitGuess() {
                        const guess = document.getElementById('guessInput').value;
                        fetch('/guess?number=' + guess)
                            .then(response => response.text())
                            .then(text => {
                                document.getElementById('result').innerText = text;
                            });
                    }
                </script>
                </body>
                </html>
            """;
            exchange.getResponseHeaders().add("Content-Type", "text/html");
            exchange.sendResponseHeaders(200, html.length());
            OutputStream os = exchange.getResponseBody();
            os.write(html.getBytes());
            os.close();
        }
    }
}

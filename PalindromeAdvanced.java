import java.util.Scanner;

public class PalindromeAdvanced {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Enter a string or number: ");
    String input = scanner.nextLine();
        
        String processedInput = input.replaceAll("\\s+","").toLowerCase();
        
        String reversed = "";
        for (int i = processedInput.length() - 1; i >= 0; i--) {
            reversed += processedInput.charAt(i);
         }
         
         if (processedInput.equals(reversed)) {
            System.out.println("Palindrome");
         } else {
            System.out.println("Not a palindrome");
        }
        
        scanner.close();
    }
  }

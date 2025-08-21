import java.util.Scanner;

public class armstrongnumber {
  
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;

        }
        return count;

    }
    public static boolean isarmstrong( int number) {
        int original = number;
        int digits = countDigits(number);
        int sum = 0;

        while (number > 0){
            int digit = number % 10 ;
            sum += Math.pow(digit, digits);
            number /= 10;

        }
        return sum == original;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int input = scanner.nextInt();

        if (isarmstrong(input)) {
            System.out.println(input + " ia a armstrong number.");
        } else {
            System.out.println(input + " is not an armstrong number.");

        }
        scanner.close();
        
    }
}

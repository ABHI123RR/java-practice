import java.util.Scanner;

public class student{
  public static void main (String []args){
    
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter your name: ");

    String name=sc.nextLine();

    System.out.println("Enter your age: ");

    String age=sc.nextLine();

    System.out.println("Enter your favorite food: ");

    String food=sc.nextLine();

    System.out.println("\n---profile---");

    System.out.println("Name:  " + name);
    System.out.println("Age:  " + age);
    System.out.println("Favorite food: " + food );

    
  }
  

}
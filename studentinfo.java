import java.util.Scanner;

public class studentinfo{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name: " );
    String name=sc.nextLine();
    System.out.println("Enter your rollno: ");
    String Rollno=sc.nextLine();
    System.out.println("Enter your age: ");
    int age=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your department: ");
    String department=sc.nextLine();
    System.out.println("Enter your CGPA: ");
    double CGPA=sc.nextDouble();

    System.out.println("---Student information---");

    System.out.println("Name:  " + name);
    System.out.println("Rollno:  " + Rollno);
    System.out.println("Age: " + age);
    System.out.println("Department: " + department);
    System.out.println("CGPA: " + CGPA);
  }
}
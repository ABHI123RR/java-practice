import java.util.Scanner;

class Student{
  String name;
  int rollNumber;
  int[] marks=new int[3];

  void inputDetails(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter student name:");
  name=sc.nextLine();

  System.out.print("Enter roll number:");
  rollNumber=sc.nextInt();

  System.out.println("Enter marks for 3 subjects:");
  for(int i=0; i<3; i++){
    System.out.print("Subject" + (i+1)+":");
    marks[i]=sc.nextInt();
  }
}
  int calculateTotal(){
    int total=0;
    for(int mark:marks){
      total+=mark;
    }
    return total;
  }

  double calculateAverage(){
    return calculateTotal()/3.0;

  }

  void displayResult(){
    System.out.println("\n---Student Result---");

    System.out.println("Name:"+name);
    System.out.println("Roll Number:"+rollNumber);
    System.out.println("Total Marks:"+calculateTotal());
    System.out.println("Average Marks:"+calculateAverage());
  }
  }

  public class StudentMain{
    public static void main(String[]args){
      Student s1 = new Student();
      s1.inputDetails();
      s1.displayResult();
    }
  }
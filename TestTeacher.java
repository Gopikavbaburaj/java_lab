import java.io.*;
import java.util.Scanner;

class Employee
{
 int empid;
 String name;
 int salary;
 String address;
 Employee()
 {
 empid=0;
 name=" ";
 salary=0;
 address=" ";
 }

 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter the Employee id  :");
 empid=sc.nextInt();
 sc.nextLine();
 System.out.print("Enter the Employee name  :");
 name=sc.nextLine();
 System.out.print("Enter the Salary  :");
 salary=sc.nextInt();
 sc.nextLine();
 System.out.print("Enter the Address  :");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("Employee id : "+empid);
 System.out.println("Employee name :"+name);
 System.out.println("Salary :"+salary);
 System.out.println("Address :"+address);
 }
}

class Teacher extends Employee
{
 String dept;
 String subj;
 Teacher()
 {
 dept="";
 subj="";
 }
 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter the Department name  :");
 dept=sc.nextLine();
 System.out.print("Enter the Subject name  :");
 subj=sc.nextLine();
 System.out.println(" ");
 }
 void display()
 {
 super.display();
 System.out.println("Department :"+dept);
 System.out.println("Subject :"+subj);
 System.out.println(" ");
 }
}
 class TestTeacher
 {
  public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Numbers of teachers  :");
   int count=sc.nextInt();
   Teacher t[]=new Teacher[count];
   for (int i=0; i<count; i++)
   {
    t[i]=new Teacher();
    t[i].read();
    }

    System.out.println(" DISPLAY");
    System.out.println("..........");
   for (int i=0; i<count; i++)
   {
    System.out.println("Teacher details:");
    t[i].display();
   }
}
}
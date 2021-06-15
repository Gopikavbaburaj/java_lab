import java.io.*;
import java.util.Scanner;
class Person
{
 String name;
 String gender;
 String address;
 int age;
Person( )
{
 name=" ";
 gender=" ";
 address=" ";
 age=0;
}
void read()
 {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the Name  :" );
 name=sc.nextLine();
 System.out.print("Enter Gender-M/F  :");
 gender=sc.nextLine();
 System.out.print("Enter address  :" );
 address=sc.nextLine();
 System.out.print("Enter Age  :" );
 age=sc.nextInt();
 }
 void display()
{
 System.out.println("Name of the Person :"+name);
 System.out.println("Gender :"+gender);
 System.out.println("Address :"+address);
 System.out.println("Age "+age);
}
}
class Employee extends Person 
{
 String Empid;
 String Company_name;
 String Qualification;
 int Salary;
 Employee()
 {
 Empid=" ";
 Company_name=" ";
 Qualification=" ";
 Salary =0;
 }
 void read()
 {
 super.read();
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter Empid  :" );
 Empid=sc.nextLine();
 System.out.print("Enter Company Name  :");
 Company_name=sc.nextLine();
 System.out.print("Enter Qualification  :" );
 Qualification=sc.nextLine();
 System.out.print("Enter Salary  :" );
 Salary=sc.nextInt();
 }
 void display()
 {
 super.display();
 System.out.println("Empid :" +Empid);
 System.out.println("Company Name :" +Company_name);
 System.out.println("Qualification :" +Qualification);
 System.out.println("Salary :" +Salary);
 }
}

class Teacher extends Employee
{
 String Dept;
 String Subj;
 String Tid;
 Teacher()
 {
 Dept=" ";
 Subj =" ";
 Tid=" ";
 }
 void read()
 {
 super.read();
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter Department Name  :" );
 Dept=sc.nextLine();
 System.out.print("Enter Subject  :");
 Subj=sc.nextLine();
 System.out.print("Teacher Id  :" );
 Tid=sc.nextLine();
 System.out.println(" ");

 }
 
 void display() 
{
 super.display();
 System.out.println("Department " +Dept);
 System.out.println("Subject " +Subj);
 System.out.println("Teacher id " +Tid);
 System.out.println(" ");
 }
}
class TestEmp
{
 public static void main(String args[]) 
{
 Scanner s = new Scanner(System.in);
 System.out.print("Enter the number of teachers : ");

 int n = s.nextInt();
 System.out.println(" ");
 Teacher t[] = new Teacher[n];
 for (int i = 0; i < n; i++) 
{
 t[i] = new Teacher();
 t[i].read();
 }
 System.out.println(" DISPLAY");
 System.out.println(".........");
 for (int j = 0; j < n; j++) 
{
 t[j].display();
 }
 }
}
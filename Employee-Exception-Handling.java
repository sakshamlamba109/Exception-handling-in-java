import java.util.*;
class InvalidNameException extends Exception{
InvalidNameException(String s){
super(s);
}
}
class AgeException extends Exception{
AgeException(String s){
super(s);
}
}
public class Employee {
String name;
int age;
public static void main(String[] args)throws InvalidNameException {
// TODO Auto-generated method stub
Employee employee= new Employee();
Scanner sc1= new Scanner(System.in);
Scanner sc2= new Scanner(System.in);
System.out.println("Enter name");
employee.name= sc1.nextLine();
System.out.println("Enter age");
employee.age= sc2.nextInt();
try {
int a=Integer.parseInt(employee.name);
throw new InvalidNameException("Non numeric value is inserted");
}
catch(NumberFormatException e) {
System.out.println("Name:"+employee.name);
}
try {
if(employee.age>50) {
throw new AgeException("Age must be less than equal to 50 years");
}
else {
System.out.println("Age:"+employee.age);
}
}
catch(AgeException e) {
System.out.println("Sorry,Wrong input: "+e);
}
}
}
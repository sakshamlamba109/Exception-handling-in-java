import java.util.Scanner;
public class DivideByZero {
public static void main(String[] args) {
// TODO Auto-generated method stub
int a,b;
float result;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers");
a=sc.nextInt();
b=sc.nextInt();
try
{
result=a/b;
System.out.println("The value after dividing "+a+" by "+b+" is "+result);
}
catch(ArithmeticException e)
{
System.out.println("Sorry, division by zero is not possible");
}
System.out.println("The value of "+a+" x "+b+" is "+(a*b));
}
}
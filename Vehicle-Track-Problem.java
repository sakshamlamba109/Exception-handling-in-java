//4) On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running in different direction there is a chance of collision. To avoid collisions write a Java program using exception handling. You are free to make necessary assumptions.


import java.util.Scanner;
class WrongRoute extends Exception
{
WrongRoute(String str1)
{
super(str1);
}
}
public class Accident {
void check(String s1, String s2) throws WrongRoute
{
if(s1.equals(s2))
System.out.println("You are driving safely");
else
throw new WrongRoute("Please drive safely");
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("On which direction is the first vehicle running (left or right)");
String str=sc.nextLine();
System.out.println("On which direction is the second vehicle running (left or right)");
String string=sc.nextLine();
Accident obj=new Accident();
try {
obj.check(str, string);
}
catch(WrongRoute e)
{
System.out.println("The vehicles may collide : "+e);
}
}
}
OUT
class InvalidException extends Exception{
InvalidException(String s)
{
super(s);
}
}
public class Nonnumeric {
public static void main(String[] args) throws InvalidException {
// TODO Auto-generated method stub
try
{
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
System.out.println("Modulus is : "+x%y);
}
catch(NumberFormatException e)
{
throw new InvalidException("Non numeric value entered:");
}
}
}
import java.util.Scanner;
public class ArrayException
{
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String sname[]=new String[10];
int rollno[]=new int[10];
int j;
char ch,c;
System.out.println("Enter the name of 10 students");
for(int i=0;i<10;i++)
sname[i]=sc.nextLine();
System.out.println("Enter the roll number of 10 students");
for(int k=0;k<10;k++)
rollno[k]=sc.nextInt();
do {
try
{
do
{
System.out.println("Enter the index number of the student that you want");
j=sc.nextInt();
int l=j-1;
System.out.println("The name and roll number of the student with student index "+j+" is "+rollno[l]+" "+sname[l]);
System.out.println("Want to get roll number and name of another student(y/n)");
c=sc.next().charAt(0);
}
while(c=='y');
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Sorry there are only 10 students");
System.out.println("Want to enter another time(y/n)");
}
ch=sc.next().charAt(0);
}while(ch=='y');
}
}
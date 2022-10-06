import java.util.*;
public class Buzz
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();

if(n % 10 == 7 || n % 7 == 0) 
System.out.println(n+" is buzz number");
else
System.out.println(n+" is not buzz number");
}
}
 
 
import java.util.*;
public class constructor
{
    double l,b;
    String c; static int r;
    public constructor()
    {
        l=0.0;
        b=0.0;
        c="Sharmistha";
        r=5;
    }
    
    public void calculate()
    {
        double area=l*b;
        System.out.println("The area is = "+area);
    }
    
    public static void cube()
    {
        double cb=r*r*r;
        System.out.println("The cube is = "+cb);
    }
    
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        constructor ob=new constructor();
        
         System.out.println("Enter the length: ");
         ob.l=sc.nextDouble();
         
         System.out.println("Enter the breadth: ");
         ob.b=sc.nextDouble();
         
         ob.calculate();
         cube();
         System.out.println("The name is= "+(ob.c));
    }
}
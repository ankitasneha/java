import java.util.Scanner;
public class Largest
{
    public static void main(String args[])
    {
    int a,b,c;
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    c=Integer.parseInt(args[2]);
    if(a>b && a>c)
    {
       System.out.println("The largest number is "+a);
    }
    else if(b>c)
    {
       System.out.println("The largest number is "+b);
    }
    else
    {
       System.out.println("The largest number is "+c);
    }
}
}
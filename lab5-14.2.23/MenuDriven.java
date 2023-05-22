import java.util.Scanner;

public class MenuDriven
{
public static void main(String args[])
{
double x,b,h;
float a;

Scanner sc=new Scanner(System.in);
int ch;
System.out.println("Enter the choice");
System.out.println("Enter 1 for area of circle");
System.out.println("Enter 2 for area of triangle");
System.out.println("Enter 3 for area of square");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the side");
x=sc.nextDouble();
System.out.println("The area of circle is "+3.14*x*x);
break;
case 2:
System.out.println("Enter the breadth and height");
b=sc.nextDouble();
h=sc.nextDouble();
System.out.println("The area of triangle is "+(0.5*b*h));
break;
case 3:
System.out.println("Enter the side");
a=sc.nextFloat();
System.out.println("The area of square is "+a*a);
break;
default:
System.out.println("Error");
}

}
}


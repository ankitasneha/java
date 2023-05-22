import java.util.Scanner;
class Overload
{
void area(double x)
{
System.out.println("The area of circle is "+3.14*x*x);
}
void area(double b,double h)
{
System.out.println("The area of triangle is "+0.5*b*h);
}
void area(float a)
{
System.out.println("The area of square is "+a*a);
}
}
public class Area
{
public static void main(String args[])
{
double x,b,h;
float a;
Scanner sc=new Scanner(System.in);
Overload o1=new Overload();
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
o1.area(x);
break;
case 2:
System.out.println("Enter the breadth and height");
b=sc.nextDouble();
h=sc.nextDouble();
o1.area(b,h);
break;
case 3:
System.out.println("Enter the side");
a=sc.nextFloat();
o1.area(a);
break;
default:
System.out.println("Error");
}

}
}


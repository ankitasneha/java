import java.util.Scanner;
public class Rectangle
{
double length;
double breadth;
Rectangle(double l,double b)
{
length=l;
breadth=b;
}
double calculate()
{
double perimeter=2*(length+breadth);
System.out.println("The perimeter is "+perimeter);
double area=length*breadth;
return area;
}
void display()
{
System.out.println("The area of rectangle is " +calculate());

}
public static void main(String args[])
{
Rectangle r=new Rectangle(10.0,20.0);
r.display();
}
}


import java.util.Scanner;
class Rectangle
{
double length;
double breadth;

void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length");
length=sc.nextDouble();
System.out.println("Enter the breadth");
breadth=sc.nextDouble();
}
double calculate()
{
System.out.println("The perimeter of rectangle is "+2*(length+breadth));
double a=length*breadth;
return a;

}

void display()
{
System.out.println("The area is "+calculate());
}
}
public class Demo1
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.read();
r.display();
}
}


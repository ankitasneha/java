import java.util.Scanner;
class box
{
double length;
double width;
double height;

double volume()
{
return length*width*height;
}
void get_value(double l,double w,double h)
{
length=l;
width=w;
height=h;

}
}

public class Demo
{
public static void main(String args[])
{
box b=new box();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length,width,height");
double length1=sc.nextDouble();
double width1=sc.nextDouble();
double height1=sc.nextDouble();
double volume1;
b.get_value(length1,width1,height1);
volume1=b.volume();
System.out.println(volume1);
}
}


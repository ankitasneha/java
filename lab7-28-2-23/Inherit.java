import java.util.Scanner;
class 2D
{
double length,breadth;
Scanner sc=new Scanner(System.in);
length=sc.nextDouble();
breadth=sc.nextDouble();

}
class 3D extends 2D
{
double height;
Scanner sc=new Scanner(System.in);
height=sc.nextDouble();
void calculate()
{
System.out.println("The cost of the sheet is :"+(40*(length*breadth)+60*(length*breadth*height));
}
public class Inherit
{
public static void main(String args[])
{
2D ref=new 3D();
ref.calculate();
}
}
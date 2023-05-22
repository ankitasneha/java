import java.util.Scanner;
class Over
{
double subtract(double a,double b)
{
double s=a-b;
System.out.println("Subtraction of 2 numbers are "+s);
return s;
}
double subtract(int a,int b)
{
int t=a-b;
System.out.println("Subtraction of 2 numbers are "+t);
return t;

}
float subtract(int a, float b)
{
float u=a-b;
System.out.println("Subtraction of 2 numbers are "+u);
return u;
}
}
public class Sub
{
public static void main(String args[])
{
Over o=new Over();
o.subtract(10.0,2.0);
o.subtract(10.0,4.0);
o.subtract(20,10);

}
}


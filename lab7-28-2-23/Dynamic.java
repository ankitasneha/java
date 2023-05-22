import java.util.Scanner;
class A
{
void show()
{
System.out.println("A class method");
}
}
class B extends A
{
void show()
{
System.out.println("b class method");
}
}
public class Dynamic
{
public static void main(String args[])
{
A ref;
B ob=new B();
ob=ref;
ref.show();
}
}
import java.util.Scanner;
abstract class Student
{
	int roll,cgpa,age;
	String name,branch;
	public abstract void marks();
}
class CIA extends Student
{
	public void marks()
	{
		System.out.println("This is for sub class CIA");
		int t=0;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			t+=a[i];
		}
		
		System.out.println("The total marks is:"+t);
	}
}
class Semester extends Student
{
	public void marks()
	{
		System.out.println("This is for sub class Semester");
		int t=0;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			t+=a[i];
		}

		System.out.println("The total marks is:"+t);
	}
}
public class Base
{
	public static void main(String args[])
	{
		CIA c=new CIA();
		c.marks();
		Semester s=new Semester();
		s.marks();
	}
}


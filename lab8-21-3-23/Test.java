import java.util.Scanner;
interface Student
{
	void student();
}
interface marks
{
	void marks();
}
interface department extends Student,marks
{
	
}
public class Test
{
	public void student()
	{
		System.out.println("This prints the student's name");
	}
	public void marks()
	{
		
		System.out.println("This prints the student's marks");
	}
	public static void main(String args[])

	{
	
		Test t=new Test();
		t.student();
		t.marks();
	}
}
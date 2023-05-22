//Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
try{
	for(int i=0;i<=a.length;i++)
		System.out.println(a[i]+" ");
}
catch(Exception e){
System.out.println("Exception caught");
}
}
}

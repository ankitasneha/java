import java.util.Scanner;
public class Accept
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int odd=0,even=0;
System.out.println("Enter 10 elements of array");
for(int i=0;i<10;i++)
{
  a[i]=sc.nextInt();
}
for(int i=0;i<10;i++)
{
if(a[i]%2==0)
{
even++;
System.out.println("The number is even:"+a[i]);
}
else
{
odd++;
System.out.println("The number is odd:"+a[i]);
}
}
System.out.println("The total number of odd numbers are "+odd);
System.out.println("The total number of even numbers are "+even);
}
}


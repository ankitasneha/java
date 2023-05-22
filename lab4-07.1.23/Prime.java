import java.io.*;
public class Prime
{
public static void main(String args[])
{
int n=53,i,flag=0;

for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("The number is prime number");
else
System.out.println("The number is not prime number");
}
}
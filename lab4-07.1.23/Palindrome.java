import java.io.*;
public class Palindrome
{
public static void main(String args[])
{
int n=151,r,s=0;//235
int temp=n;
while(n!=0)
{
r=n%10;//5   3   2
s=s*10+r;//5   53  532
n=n/10;//23    2    0
}
if(s==temp)
System.out.println("The number is pallindrome");
else
System.out.println("The number is not pallindrome");

}
}
import java.util.Scanner;
class CheckArgumentException extends Exception
{
String message;
public CheckArgumentException(String message)
{
this.message=message;
}
public String toString()
{
return message;
}
}
public class Demo
{
public static void main(String args[])
{
int count=0,sum=0,a;
for(int i=0;i<args.length;i++)
{
count=Integer.parseInt(args[i]);

}
count++;

if(count<4)
{
try{
throw new CheckArgumentException("Count is less than 4");
}
catch(CheckArgumentException e)
{
System.out.println(e);
}
}
else
{
for(int i=0;i<args.length;i++)
{
a=Integer.parseInt(args[i]);
sum=sum+(a*a);

}
System.out.println(sum);
}
}
}
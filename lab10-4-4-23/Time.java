import java.util.Scanner;
class HrsException extends Exception
{
String message;
public HrsException(String message)
{
this.message=message;
}
public String toString()
{
return message;
}
}
class MinException extends Exception
{
String min;
public MinException(String min)
{
this.min=min;
}
public String toString()
{
return min;
}
}
class SecException extends Exception
{
String sec;
public SecException(String sec)
{
this.sec=sec;
}
public String toString()
{
return sec;
}
}

public class Time
{
public static void main(String args[])
{
int hours,minutes,seconds;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the time in hours:");
hours=sc.nextInt();
System.out.println("Enter the time in minutes:");
minutes=sc.nextInt();
System.out.println("Enter the time in seconds:");
seconds=sc.nextInt();
if(hours>24 || hours<0)
{
try{
throw new HrsException("Wrong hour given");
}
catch(HrsException e)
{
System.out.println(e);
}
}

else if(minutes>60 || minutes<0)
{
try{
throw new MinException("Wrong minute given");
}
catch(MinException e1)
{
System.out.println(e1);
}
}
else if(seconds>60 || seconds<0)
{
try{
throw new SecException("Wrong second given");
}
catch(SecException e2)
{
System.out.println(e2);
}
}
else
{
System.out.println("The time is:"+hours+" "+ minutes+" "+seconds);
}
}
}	



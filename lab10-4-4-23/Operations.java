import java.util.Scanner;
public class Operations
{
public static void main(String args[])
{
String nstr="";
char ch;
String s1=new String("Kiit");
String s2=new String("BBSR");
String s=s1.toLowerCase();
System.out.println("The lower case is:"+s);
String s3=s1.toUpperCase();
System.out.println("The upper case is:"+s3);
for (int i=0; i<s2.length(); i++)
      {
        ch= s2.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
   

}
}

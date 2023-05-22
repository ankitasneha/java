//WAP to take a string from a user using BufferedReader class then write that string into the file named as "abc.txt".
import java.io.*;
public class Capitalize
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
FileWriter fw=new FileWriter("abc.txt");
char s1=s.charAt(0);
char ch=s1.toUpperCase();
fw.write(ch);
for(int i=1;i<s.length();i++)
{
fw.write(s.charAt(i));

}
fw.close();
}
}


//WAP to take a string from a user using BufferedReader class then write that string into the file named as "abc.txt".
import java.io.*;
public class Test
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
FileWriter fw=new FileWriter("abc.txt");
for(int i=0;i<s.length();i++)
{
fw.write(s.charAt(i));
}
fw.close();
}
}


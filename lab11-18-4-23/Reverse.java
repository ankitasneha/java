//WAP to take a string from a user using BufferedReader class then reverse the code and write that string into the file named as "abc.txt".
import java.io.*;
public class Reverse
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
FileWriter fw=new FileWriter("abc.txt");
for(int i=s.length()-1;i>=0;i--)
{
fw.write(s.charAt(i));
}
fw.close();
}
}


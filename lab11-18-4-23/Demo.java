//WAP to copy the contents of one file into another file.
import java.io.*;
public class Demo
{
public static void main(String args[]) throws IOException
{
int i=0;
FileInputStream fr=new FileInputStream("abc.txt");
FileOutputStream fw=new FileOutputStream("xyz.txt");
do{
i=fr.read();
if(i>-1)
{
fw.write(i);
}
}while(i!=-1);

fr.close();
fw.close();
}
}

		
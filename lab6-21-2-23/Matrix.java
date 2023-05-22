import java.util.Scanner;
public class Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
int d1=0,d2=0;
System.out.println("Enter the array elements");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(i==j)
{
d1=d1+a[i][j];
}
if((i+j)==2)
{
d2=d2+a[i][j];
}
}
}
System.out.println("The sum of diagonal1 is "+d1);
System.out.println("The sum of diagonal2 is "+d2);

}
}

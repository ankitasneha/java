import java.util.Scanner;
interface motor
{
int capacity=100;
void run();
void consume();
}
class WashingMachine implements motor
{
public void run()
{
System.out.println("RUN");
}
public void consume()
{
System.out.println("CONSUME");
}
public static void main(String args[])
{
WashingMachine ob=new WashingMachine();
System.out.println("The value is "+ob.capacity);
ob.run();
ob.consume();

}
}

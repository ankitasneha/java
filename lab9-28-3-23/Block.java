//Write a Java program to illustrate try..catch..finally block.
import java.util.Scanner;
class Block{
public static void main(String args []){
try{
System.out.println("inside try block");
int data=25/0;
System.out.println(data);
}
catch(ArithmeticException e){
System.out.println("exception handled");
System.out.println(e);
}
finally{
System.out.println("finally block is always executed");
}
}
}

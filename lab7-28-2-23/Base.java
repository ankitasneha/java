
import java.util.*;


class A{
     static{

    System.out.println("1");
    
    A() { System.out.println(“2”); }
    
    class B extends A 
    { 
        static {
    
    System.out.println("3");
    
    B{ System.out.println("4"); }
    
    class Demo{ public static void main(String x[]){ new B():
    
    }}
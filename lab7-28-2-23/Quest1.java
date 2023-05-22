import java.io.*;
import java .util.*;

class twod{
    Scanner sc=new Scanner(System.in);
    int l;
    int b;
    twod(){
        System.out.println("Enter the length:");
        l=sc.nextInt();
        System.out.println("Enter the breadth:");
        b=sc.nextInt();
    }
    void displayprice1(){
        int price,area;
        area=l*b;
        price=40*area;
        System.out.println("Price of sheet:"+price+" rupees");

        
    }

}

class threed extends twod{
    int h;
    threed(){
        System.out.println("Enter the height:");
        h=sc.nextInt();
    }
    void displayprice2(){
        int price,sa;
        sa=(2*(l*b))+(2*(b*h))+(2*(l*h));
        price=60*sa;
        System.out.println("Price of box:"+price+" rupees");

        
    }

}

public class Quest1{
    public static void main(String args[]){
        threed ob=new threed();
        ob.displayprice1();
        ob.displayprice2();
    }
}
import java.io.*;
import java .util.*;

class shape{
    Scanner sc=new Scanner(System.in);
    double area;
    void showarea(){
        System.out.println("Area:"+area);
    }

}

class circle extends shape{
    int r;
    circle(){
        System.out.println("Enter the radius:");
        r=sc.nextInt();
        area=3.14*r*r;
    }

}

class rectangle extends shape{
    int l,b;
    rectangle(){
        System.out.println("Enter the length:");
        l=sc.nextInt();
        System.out.println("Enter the breadth:");
        b=sc.nextInt();
        area=l*b;
    }

}
class Quest4{
    public static void main(String args[]){
        rectangle ob1=new rectangle();
        ob1.showarea();
        circle ob2=new circle();
        ob2.showarea();
    }
}
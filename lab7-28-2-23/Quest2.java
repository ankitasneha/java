import java.io.*;
import java .util.*;

class plate{
    Scanner sc=new Scanner(System.in);
    int l;
    int w;
    plate(){
        System.out.println("Enter the length:");
        l=sc.nextInt();
        System.out.println("Enter the width:");
        w=sc.nextInt();
    }

}

class box extends plate{
    int h;
    box(){
        System.out.println("Enter the height:");
        h=sc.nextInt();
    }

}

class woodbox extends box{
    int t;
    woodbox(){
        System.out.println("Enter the thickness:");
        t=sc.nextInt();
    }

}


public class Quest2{
    public static void main(String args[]){
        woodbox ob=new woodbox();
    }
}
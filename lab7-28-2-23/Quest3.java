import java.io.*;
import java.util.*;

class A{
    void show(){
        System.out.println("A is called");
    }
}

class B extends A{
    void show(){
        System.out.println("B is called");
    }

}

class Quest3{
    public static void main(String args[]){
        A ref=new B();
        ref.show();
    }
}
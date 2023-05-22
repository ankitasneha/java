import java.io.*;
import java.util.*;
class Account
{
    int acc_no;
    int balance;
    void disp()
    {
        System.out.println("Account no :"+acc_no);
        System.out.println("Balance: "+balance);
    }
}

class Person extends Account
{
    String name;
    int aadhar_no;
    Person(int a, int b, String n, int aa)
    {
        acc_no = a;
        balance = b;
        name = n;
        aadhar_no = aa;
    }
    void disp()
    {
        System.out.println("Account no :"+acc_no);
        System.out.println("Balance: "+balance);
        System.out.println("Name: "+name);
        System.out.println("Aadhar no: "+aadhar_no);
    }
}

class Quest5
{
    public static void main(String args[])
    {
        Person p1 = new Person(1,1000,"Aniran",201);
        Person p2 = new Person(2,900,"Sarkar",202);
        Person p3 = new Person(3,2000,"Harshil",203);
        Person p4 = new Person(4,5000,"Annanya",204);
        Person p5 = new Person(5,6000,"Ayush",205);
        p3.disp();
    }
}
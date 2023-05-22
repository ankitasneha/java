import java.io.*;
import java.util.*;
class abc
{
    abc(int a, float b)
    {
        System.out.println("Base class parameterized const");
    }
}

class def extends abc
{
    def()
    {
        super(2,3.5f);
        System.out.println("Derived class default const");
    }
}

class Quest6
{
    public static void main(String args[])
    {
        def ob1 = new def();
    }
}
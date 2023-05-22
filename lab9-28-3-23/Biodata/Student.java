package Biodata;
interface schooling
{
    public void school();
}
interface college
{
    public void colleges();
}
public class Student implements schooling,college
{
    public void school()
    {
        System.out.println("CHS");
    }
    public void colleges()
    {
        System.out.println("KIIT");
    }
}
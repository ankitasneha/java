import java.util.Scanner;
interface Test
{
void earnings();
void deductions();
void bonus();
}
class Manager implements Test
{
double earning=0,deduction_pf=0,bonus=0,basic=100000,da=0,hra=0;
public void earning()
{
da=0.80*basic;
hra=0.15*basic;
earning=basic+da+hra;
System.out.println("The earning is"+earning);
}
public void deductions()
{
deduction_pf=0.12*basic;
System.out.println("The deduction is"+deduction_pf);
}
}
class Substaff extends Manager implements Test
{
public void bonus()
{
bonus=0.50*basic;
System.out.println("The bonus is"+bonus);
}
public static void main(String args[])
{
Substaff ob=new Substaff();
ob.earnings();
ob.deductions();
ob.bonus();
}
}



import java.util.Scanner;
class LessBalanceException extends Exception
{
String message;
public LessBalanceException(String message)
{
this.message=message;
}
public String toString()
{
return message;
}
}


public class Balance
{
public static void main(String args[])
{
int minimum_balance,withdraw_amount,deposit_amount;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the minimum balance:");
minimum_balance=sc.nextInt();
System.out.println("Enter the withdrawal amount:");
withdraw_amount=sc.nextInt();
System.out.println("Enter the deposit amount:");
deposit_amount=sc.nextInt();
if(minimum_balance<500)
{
try{
throw new LessBalanceException ("Withdraw amount is not valid");
}
catch(LessBalanceException  e)
{
System.out.println(e);
}
}


else
{
System.out.println("The amount is:"+minimum_balance+" "+withdraw_amount+" "+deposit_amount);
}
}
}	



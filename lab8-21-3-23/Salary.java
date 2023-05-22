import java.util.*;
 interface A {
     void deduction();
     void bonus();
     void earning();
 }
 abstract class Manager implements A {
    Scanner sc = new Scanner(System.in);
     double basic,da,hra,earn,ded,bonus;
     Manager() {
         System.out.println("enter your basic salary:");
         basic = sc.nextInt();
     }
     public void earning() {
         earn = basic + 0.8 * basic + 0.15 * basic;
         System.out.println("Earning =" +earn);
     }
     public void deduction() {
         ded = 0.12 * basic;
         System.out.println("Deduction =" + ded);
     }
     abstract public void bonus();
 }
 class Substaff extends Manager{
     public void bonus() {
         bonus = 0.5 * basic;
         System.out.println("Bonus =" + bonus);
     }
 }
 class Salary {

    public static void main(String args[]) {
        Substaff ob2 = new Substaff();
         ob2.earning();
         ob2.deduction();  
         ob2.bonus();
     }
}
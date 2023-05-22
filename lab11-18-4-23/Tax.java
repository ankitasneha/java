import java.awt.*;
import java.applet.*;
/*<applet code ="Tax.class" height=100 width=200>
<param name="P1" value="Aniran">
<param name="P2" value="1500000">
</applet>
*/
public class Tax extends Applet
{
String name;
double tax,salary;
public void init()
{
name=getParameter("P1");
salary=Double.parseDouble(getParameter("P2"));
calculate(salary);
}
public void calculate(double salary)
{
if(salary<=100000)
tax=0;
else if(salary>100000 && salary<=500000)
tax=0.2*salary;
else
tax=0.3*tax;
}
public void paint(Graphics g)
{
g.drawString("Hello"+name,20,20);
g.drawString("salary"+salary,20,20);
g.drawString("tax"+tax,20,20);
}
}
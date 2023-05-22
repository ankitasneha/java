import java.util.Scanner;
interface Permutation
{
	int permutation();
}
interface Combination
{
	void combination();
}
interface NPRnNCR extends Permutation,Combination
{
	
}
public class PNC
{
	public int Permutation(int n)
	{
		int f=1,i=1;
		while(i<=n)
		{
			f=f*i;
			i++;
		}

		return f;
	}
	
	public static void main(String args[])

	{
		int n=7,r=3,comb,per;
	
		PNC p=new PNC();
		per=p.Permutation(n)/p.Permutation(n-r);
		System.out.println("Permutation:"+per);
		comb=p.Permutation(n)/(p.Permutation(n-r)*p.Permutation(r));
		System.out.println("Combination:"+comb);
	}
}
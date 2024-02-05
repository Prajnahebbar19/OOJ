import java.util.Scanner;
import java.math.*;
class Quadratic
{	
	int a,b,c;
	double r1,r2,d;
	void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the coeffient of a,b,c");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	}
	void compute()
	{
		while(a==0)
		{
			System.out.println("It is not a quadratic equation");
			System.out.println("Enter a non-zero number");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
		}
		d=b*b-4*a*c;
		if(d==0)
		{
			System.out.println("Roots are real and equal");
			r1=(-b)/(2*a);
			System.out.println("Root1=Root2="+r1);
		}
		else if(d>0)
		{
			System.out.println("Roots are real and distinct");
			r1=(-b+(Math.sqrt(d)))/(2*a);
			r2=(-b-(Math.sqrt(d)))/(2*a);
			System.out.println("Roots are"+r1+"and"+r2);
		}
		else
		{
			System.out.println("Roots are not Real");
		}
	}
}
class QuadraticMain
{
	public static void main(String SX[])
	{
		Quadratic q=new Quadratic();
		q.get();
		q.compute();
	}
}


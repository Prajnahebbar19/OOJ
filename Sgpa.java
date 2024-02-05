import java.util.Scanner;
class Student
{
	int m,grade,tot=0;
	double sum=0.0,sgpa;
	String usn;
	int mark[]=new int[25];
	int credit[]=new int[25];
	String name;
	Scanner s=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter the name and usn of the student");
		name=s.next();
		usn=s.next();
		System.out.println("Enter the number of subjects:");
		m=s.nextInt();
		System.out.println("Enter the marks and credits of every subject:");
		for(int j=0;j<m;j++)
		{
				System.out.println((j+1)+"."+"Marks=");
				mark[j]=s.nextInt();
				System.out.println("Credits=");
				credit[j]=s.nextInt();
		}
	}
	void display()
	{
		System.out.println("Details of Students:");
		System.out.println("NAME:"+name+" USN:"+usn);
		for(int j=0;j<m;j++)
		{
				System.out.println((j+1)+"."+"MARKS="+mark[j]+" CREDITS="+credit[j]);
		}
			calc();
	}
	void calc()
	{
		for(int j=0;j<=m;j++)
		{
			if(mark[j]>=90)
			{
				grade=10;
			}
			else if(mark[j]>=80&&mark[j]<90)
			{
				grade=9;
			}
			else if(mark[j]>=70&&mark[j]<80)
			{
				grade=8;
			}
			else if(mark[j]>=60&&mark[j]<70)
			{
				grade=7;
			}
			else if(mark[j]>=50&&mark[j]<60)
			{
				grade=6;
			}
			else if(mark[j]>=40&&mark[j]<50)
			{
				grade=5;
			}
			else
			{
				grade=0;
			}
			tot=tot+credit[j];
			sum=sum+(grade*credit[j]);
		}
			sgpa=sum/tot;
		System.out.println("SGPA of Student:"+sgpa);
	}
}
class Sgpa
{
	public static void main(String SS[])
	{
		Student t=new Student();
		t.accept();
		t.display();
	}
}
			
	
 
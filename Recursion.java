import java.util.Scanner;
public class Recursion
{
	static int fact=1;
	public static void main(String[] args)	
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no : ");
	int no=sc.nextInt();
	Recursion r = new Recursion();
	r.calcFact(no);
	System.out.println(fact);			
	}
	void calcFact(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			calcFact(no-1);
		}	
	}
}
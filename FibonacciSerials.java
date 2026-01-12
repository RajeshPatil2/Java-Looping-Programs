public class FibonacciSerials
{
	public static void main(String[] args)
	{
		
		//int a,b,c;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter 1st Number :");
		//a=sc.nextInt();
		//System.out.println("Enter 2nd number :");
		//b=sc.nextInt();
		

		int a=0, b=1, c;
		System.out.println(a+" "+b);

		for(int i=1;i<=12;i++)
		{
			c=a+b;
			System.out.print(" "+ c);//1
			a=b;
			b=c;
		}
	}
}
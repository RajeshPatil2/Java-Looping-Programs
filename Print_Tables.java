import java.util.Scanner;
public class Print_Tables
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to print table");
		int num =sc.nextInt();
		//int num=2;
		for(int i=1;i<=10;i++)
		{
			//System.out.println(num*i);
			System.out.println(num + " * " + i + " = " + num*i ); // 2 * 1 = 2
		}
	}
}
public class ReverseNumber1
{
	public static void main(String[] args)
	{
		int num=54321;
		int rev=0, rem;
		
		while(num != 0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse Number is : " +rev);
	}
}












		



























//int number=5432, reverse=0;
		//for(;number != 0; number=number/10)
		//{
		//	int remainder=number%10;
		//	reverse=reverse*10+remainder;
		//	
		//}
		//System.out.println("the reverse of the given number is: " + reverse);

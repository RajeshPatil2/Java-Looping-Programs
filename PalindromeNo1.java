public class PalindromeNo1
{
	public static void main(String[] args)
	{
		int no=145;
		int rev=0, rem;
		int temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no + "is palindrome number : ");
		}
		else{
			System.out.println(no + "is not palindrome number : ");	
		}
	}

}
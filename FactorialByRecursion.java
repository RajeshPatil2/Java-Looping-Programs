public class FactorialByRecursion
{
	static int fact=1;
	public static void main(String[] args)
	{
		int no=6;
		FactorialByRecursion fr = new FactorialByRecursion();
		fr.calcFact(no);
		System.out.println("Factorial is "+" is " +fact);
	}
	void calcFact(int no)
	{
		if(no > 1)
		{
			fact=fact*no;
			calcFact(no-1);		
		}	
	}
}
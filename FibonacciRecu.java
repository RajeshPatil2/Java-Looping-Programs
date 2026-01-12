public class FibonacciRecu
{
   static int a=0,b=1,c;
    public static void main(String[] args)
    {
        System.out.println(a+" "+b);
        FibonacciRecu f=new FibonacciRecu();  
        f.printFb(12); 
    }
    void printFb(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
            printFb(i-1);
        }
    }
}
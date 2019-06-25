
public class Prime {
	public static void main(String args[])
	{
		int c=0,i;
		int n=Integer.parseInt(args[0]);
			for(i=2;i<=n;i++)
			{
				if(n%i==0)
				c++;
			}
				if(c==0)
					System.out.println("Prime number");
				else
					System.out.println("Not prime number");

		}
}



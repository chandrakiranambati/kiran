
public class Even {
	public static void main(String args[])
	{
		int i;
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
			for(i=n;i<=m;i++)
			{
				if(i%2==0)
				System.out.println(""+i);
			}
	}

}


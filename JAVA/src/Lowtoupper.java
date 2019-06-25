
public class Lowtoupper {
	public static void main(String args[])
	{
		String c=args[0];
		int a=(int)c.charAt(0);
		if(a>=65 && a<=90)
			a=a+32;
		else 
			a=a-32;
			System.out.println(c+"->"+(char)a);
		}

}

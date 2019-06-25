
public class Reverse1 {
	public static void main(String args[])
	 {
	  int n=Integer.parseInt(args[0]);
	  int a,r,rev=0;
	  a=n;
	  while(a>0)
	  {
	   r=a%10;
	   rev=rev*10+r;
	   a=a/10;
	  }
	  System.out.println(rev);
	 }
	}


public class Sumofnum {
	public static void main(String args[])
	 {
	  int n=Integer.parseInt(args[0]);
	  int r,i,sum=0;
	  for(i=n;i>0;i=i/10)
	  {
	   r=i%10;
	   sum=sum+r;
	  }
	  System.out.println(n+"->"+sum);
}
}
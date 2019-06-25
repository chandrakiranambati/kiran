
public class Gend {
	public static void main(String args[])
	{
		String gender=args[0];
		int age= Integer.parseInt(args[1]);
		if((gender.equals("female")) && (age>=1&&age<=58))
			System.out.println("intrest==8.2");
		if((gender.equals("female")) && (age>=59 && age<=100))
			System.out.println("intrest==9.2");
		if((gender.equals("male")) && (age>=1&&age<=58))
			System.out.println("intrest==8.4");
		if((gender.equals("male")) && (age>=59 && age<=100))
			System.out.println("intrest==10.5");
		}

}

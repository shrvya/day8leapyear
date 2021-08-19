package leapyear;

public class leapyear {
	int year;
	static boolean ans;
	boolean predictyear(int year)
	{
		if((((year%4)==0)&& ((year%400)!=0))||((year%100)==0))
		{
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapyear lp=new leapyear();
		ans=lp.predictyear(2008);
		if(ans == true)
		{
			System.out.println("LEAPYEAR!!");
		}else
		{
			System.out.println("NOT LEAPYEAR");
		}
		

	}

}

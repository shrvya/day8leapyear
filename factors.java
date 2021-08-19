package leapyear;

import java.util.Scanner;

public class factors {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value of n:");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
			
			
			
		}
		
		
		

	}

}

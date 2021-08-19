package leapyear;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value of n:");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("this is even no");
		}
		else if(n==1) {
			System.out.println("this is odd no");
		}
		else {
			System.out.println("this is odd no");
			
		}
		

	}

}

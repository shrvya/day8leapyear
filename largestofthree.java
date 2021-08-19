package leapyear;

import java.util.Scanner;

public class largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value of n1:");
		n1=sc.nextInt();
		System.out.println("enter value of n2:");
		n2=sc.nextInt();
		System.out.println("enter value of n3:");
		n3=sc.nextInt();
		if((n1>n2)&&(n1>n3))
		{
			System.out.println(n1+" is largest numeber");
		}
		else if((n2>n1)&&(n2>n3))
		{
			System.out.println(n2+" is largest number");
		}
		else {
			System.out.println(n3+" is largest number");
		}

	}

}

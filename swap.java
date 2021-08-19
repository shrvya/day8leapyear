package leapyear;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value of n1:");
		n1=sc.nextInt();
		System.out.println("enter value of n2:");
		n2=sc.nextInt();
		int temp;
		temp=n1;
		
		n1=n2;
		n2=temp;
		System.out.println("New value of n1 is :"+n1);
		System.out.println("New value of n2 is :"+n2);
		

	}

}

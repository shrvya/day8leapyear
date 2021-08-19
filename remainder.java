package leapyear;

import java.util.Scanner;

public class remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value of n1:");
		n1=sc.nextInt();
		System.out.println("enter value of n2:");
		n2=sc.nextInt();
        System.out.println("remainder is"+(n1%n2));
        System.out.println("quotient is"+(n1/n2));
	}

}

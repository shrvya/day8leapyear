package leapyear;

import java.util.Scanner;

public class vowelconstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char vowel[]= {'a','e','i','o','u'};
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the letter ");
		char alpha = sc.next().charAt(0); 
		for(int i=0;i<5;i++) {
			if(alpha==vowel[i])
			{
				System.out.println("This letter is a vowel");
				break;
			}
			else {
				System.out.println("This letter is not a vowel");
			    break;
			}
			
		}
		

	}

}

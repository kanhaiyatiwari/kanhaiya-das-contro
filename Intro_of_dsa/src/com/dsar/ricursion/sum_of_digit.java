package com.dsar.ricursion;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		question is find the sum of digits 
//		if disitst are 1234=10;
//		here we can also divide the problem into sub parts;
//		if sum of 1 give me the sum of other part 234;
//		1* sum(234);
//		12* sum(34);
//		123* sum(4);
//		1234;
		System.out.println("please inter dis=gits");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		System.out.println(sumOfDigit(n));
	}
	public static int sumOfDigit(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sumOfDigit(n/10);
	}

}

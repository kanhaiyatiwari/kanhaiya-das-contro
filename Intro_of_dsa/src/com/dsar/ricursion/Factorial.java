package com.dsar.ricursion;

import java.util.Scanner;

public class Factorial {
//finad the factoral of a number 
	
//	for examle if num=5;
//		5*4*3*2*1=120
//				here we can clearly say that if we want fac=5 then we need fac of 4
//				and so on;
//5*fac(4)
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("please inter a number");
		int n=s.nextInt();
		
		System.out.println(fac(n));
	}

private static int fac(int n) {
	// TODO Auto-generated method stub
if(n<=1) {
	return 1;
}
return n*fac(n-1);
}
}


package com.dsar.ricursion;

public class revrseDist {
public static void main(String[] args) {
	int n=12345;
	int[] sum=new int[1];
	rev(n,sum);
	System.out.println(sum[0]);
}

public static void rev(int n,int[]sum) {
	if(n==0) {
	
	return;
	}
	int rem=n%10;
	sum[0]=sum[0]*10+rem;
	rev(n/10,sum);
}
}

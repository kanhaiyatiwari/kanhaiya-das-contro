package com.dsar.ricursion;

public class Concept {
	
public static void main(String[] args) {
func2(5);
}

public static void func(int n) {
	// TODO Auto-generated method stub
	if(n==0) {
		return;
	}
	System.out.println(n);
	func(n--);
//	it will give the stack over flow becouse it will pass 5 first as it is
//	then subtract so five will remain same;
}

public static void func2(int n) {
	// TODO Auto-generated method stub
	if(n==0) {
		return;
	}
	System.out.println(n);
	func2(--n);
//it will give correct ans;
}
public static void func3(int n) {
	// TODO Auto-generated method stub
	if(n==0) {
		return;
	}
	System.out.println(n);
	func3(n-1);
//it will give correct ans;
}
}

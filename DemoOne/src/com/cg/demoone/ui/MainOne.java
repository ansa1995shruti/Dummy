package com.cg.demoone.ui;

public class MainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int n1=Integer.parseInt(args[0]);
		c.num1= n1;
		int n2=Integer.parseInt(args[1]);
		c.num2= n2;
		System.out.println(c.add(n1,n2));
		System.out.println(c.sub(n1,n2));
		System.out.println(c.mul(n1,n2));
		System.out.println(c.div(n1,n2));

	}

}

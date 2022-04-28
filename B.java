package com;

public class B extends A{
	
	public void method1() {
		System.out.println("Chlid Class");
		super.method1();
	}
	
	public B() {
		System.out.println("B constructor");
	}
	public static void main(String[] args) {
		B b =new B();
		b.method1();
		System.out.println("------");
		A a = new A();
		a.method1();
		System.out.println("------");
		A a1 =new B();
		a1.method1();
		System.out.println("------");
	}
	

}

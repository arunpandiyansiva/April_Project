package com;

public class Parent {
	
	protected void method1() {
		System.out.println("protected Method1");
	}

	public Parent() {
		System.out.println("parent Constructor");
	}
	
	static {
		System.out.println("parent Static Block");
	}
	
	public static void static_Method() {
		System.out.println("Static Method");
	}
	
}

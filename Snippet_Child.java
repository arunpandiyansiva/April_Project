package com;

public class Snippet_Child extends Parent  {
	public Snippet_Child() {
		System.out.println("child constructor");
	}
	@Override
	protected void method1() {
		System.out.println("Protected method in Override");
	}
	
	public static void main(String[] args) {
		
		Parent p =new Parent();
		p.method1();
		System.out.println("------------------------------------");
		Snippet_Child c = new Snippet_Child();
		c.method1();
		System.out.println("------------------------------------");
		Parent p1 = new Snippet_Child();
		p1.method1();
		System.out.println("------------------------------------");
	}
    
}

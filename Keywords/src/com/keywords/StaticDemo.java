package com.keywords;

public class StaticDemo {
	static int eid=105;
	static String ename="Jyothi";
	
	public static void display()
	{
		System.out.println("the emp id : "+eid);
		System.out.println("the emp name : "+ename);
	}
	static{
		System.out.println("This is static block");
	}
	
}
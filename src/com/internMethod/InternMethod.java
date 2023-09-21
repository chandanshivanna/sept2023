package com.internMethod;

public class InternMethod {

	public static void main(String[] args) {

		String[] names = new String[10];
		for (int i = 0; i < names.length; i++) {
		    names[i] = ("John" + i).intern();
		    
		    System.out.println(names[i]);
		}
	}
}

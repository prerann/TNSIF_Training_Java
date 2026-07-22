package org.tnsif.acc.java.training;

public class reverseString {
	public static void main(String[]args) {
		String string="Eclipse";
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse+=string.charAt(i);
		}
		System.out.println("Reverse String: "+ reverse);
	}
}


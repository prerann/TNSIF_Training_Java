package org.tnsif.acc.java.training;


public class VariableDemo {
	int price=10;
	void print() {
		String mssg="Hi Hello";
		System.out.println(mssg);		
	}
	static String Messi="Football Legend";
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(Messi);
		System.out.println(obj.price);
		obj.print();
	}

}

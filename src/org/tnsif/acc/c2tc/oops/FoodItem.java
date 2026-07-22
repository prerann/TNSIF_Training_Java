package org.tnsif.acc.c2tc.oops;

public class FoodItem {

	
		String name;
		String category;
		double price;
		
		void displayDetail() {
			System.out.println("Food name :"+name);
			System.out.println("price :"+price);
			System.out.println("Category :"+category);
			System.out.println("- - - - - - - - - - - - - - - -");
			System.out.println();
		}

		public static void main(String[] args) {
			FoodItem foodItem1=new FoodItem();
			foodItem1.name="Mutton Biriyani";
			foodItem1.price=480;
			foodItem1.category="Non Veg";
			
			FoodItem foodItem2=new FoodItem();
			foodItem2.name="Chicken Biriyani";
			foodItem2.price=280;
			foodItem2.category="Non Veg";
			
			foodItem1.displayDetail();
			foodItem2.displayDetail();
		}

}

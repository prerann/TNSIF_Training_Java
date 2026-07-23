package org.tnsif.acc.c2tc.oops;


	
	 class Human{
		
		private String name;
		private int age;
		private String Gender;
		
		public void setName(String name) {
			this.name = name;
		}		
		public String getName() {
			return name;
		}
		
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		
		
		public void setGender(String gender) {
			Gender = gender;
		}
		public String getGender() {
			return Gender;
		}

		public class EncapsulationDemo {		

			public static void main(String[] args) {
				Human obj=new Human();
				obj.setName("Preran");
				obj.setAge(21);
				obj.setGender("Male");				
				System.out.println(obj.getName());
				System.out.println(obj.getAge());
				System.out.println(obj.getGender());
				System.out.println("-------------------");
				System.out.println();
				 
				obj.setName("Nayana");
				obj.setAge(20);
				obj.setGender("Female");
				System.out.println(obj.getName());
				System.out.println(obj.getAge());
				System.out.println(obj.getGender());
				System.out.println("-------------------");
				System.out.println();
				
				

	}

		
		


}
}

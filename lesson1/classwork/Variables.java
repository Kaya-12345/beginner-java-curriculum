public class Variables {
	public static void main(String[] args){
		int age = 9; // int stores whole numbers
		System.out.println(age);

		double height = 1.9; // double stores decimal numbers
		System.out.println(height);

		String name = "Alex"; // String stores text
		System.out.println(name);

		boolean likesCoding = true; // bollean stores true or false
		System.out.println(likesCoding);

		System.out.println("My name is " + name + ".");
		System.out.println("I am" + age + "years old.");

		age = 10; // Change the value stored inside the variable
		System.out.println("Next year I will be" + age + ".");
	}
}
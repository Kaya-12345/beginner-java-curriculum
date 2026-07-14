public class MathOperators{
	public static void main(String[a] args){
		System.out.println(4 + 5); // Addition: adds two numbers
		
		System.out.println(10 - 3); // Subtraction: subtracts the second number from the first number

		System.out.println(6 * 7); // Multiplication: multiplies two numbers

		System.out.println(15 / 2); // Integer Division: divides and removes the decimal part

		System.out.println(15.0 / 2); // Double Division: gives a decimal result

		System.out.println(15 % 2); // Modulus: gives the remainder

		// You can combine numbers and math operators
		// Java follows the order of operations
		System.out.println(2 + 3 * 4);
		System.out.println((2 + 3) * 4);

		int a = 8;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a * b);
		
		int x = 12;
		int y = 5;
		System.out.println(x / y);
		System.out.println(x % y);
	}
}
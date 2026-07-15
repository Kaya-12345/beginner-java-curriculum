public class ComparisonOperators{
	public static void main(String[] args){
		// comparison operators compare values and return true or false
		System.out.println(5 > 3); // Greater than
		System.out.println(5 < 3); // Less than
		System.out.println(5 == 3); // Equal to
		System.out.println(5 != 3); // Not equal to
		System.out.println(5 >= 3); // Greater than or equal to
		System.out.println(5 <= 3); // Less than or equal to

		// You can compare variables too
		int a = 10;
		int b = 7;
		System.out.println(a > b);
		System.out.println(a == b);

		int x = 13;
		int y = 20;
		System.out.println(x < y);
		System.out.println(x != y);

		String word1 = "apple";
		String word2 = "Apple";
		System.out.println(word1.equals(word2)); // Case matters when comparing Strings
		// Use .equals() to compare Strings
	}
}
public class ArrayLength{
	public static void main(String[] args){
		String[] fruits = {"apple", "banana", "cherry", "date", "dragonfruit"};
		
		int length = fruits.length; // Get the number of items in the array (array length)
		System.out.println("Number of fruits: " + length);

		String lastFruit = fruits[length -1]; // Use the length to access the last item
		System.out.println("Last fruit: " + lastFruit);

		// Error: arrays are indexed from 0 to length - 1
		// System.out.println(fruits[length]);
	}
}
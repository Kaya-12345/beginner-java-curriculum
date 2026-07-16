public class Arrays{
	public static void main(String[] args){
		String color = "red";
		String[] colors = {"red", "green", "blue", "yellow"};

		// Arrays are 0 indexed
		System.out.println("First color: " + colors[0]);
		System.out.println("Second color: " + colors[1]);
		System.out.println("Third color: " + colors[2]);
		System.out.println("Fourth color: " + colors[3]);

		colors[1] = "purple" // Change the item at index 1
		System.out.println("New second color: " + colors[1]);

		// Error: array index out of bounds
		// System.out.println(colors[10]);
	}
}
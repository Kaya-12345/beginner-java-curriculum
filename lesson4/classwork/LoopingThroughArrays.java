public class LoopingThroughArrays{
	public static void main(String[] args){
		int[] numbers = {5, 6, 1, 4, 9, 3}
		
		// i will go through each index in the array
		for (int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}

		String[] animals = {"cat", "dog", "tiger", "lion");

		for (int i = 0; i < animals.length; i++){
			System.out.println(animals[i]);
		}
	}
}
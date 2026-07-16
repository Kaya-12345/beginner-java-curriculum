public class RandomItem{
	public static void main(String[] args){
		String[] animals = {"cat", "dog", "rabbit", "hamster", "parrot");

		// Arrays are indexed from 0 to length - 1
		// Math.random() returns [0.0, 1.0)
		int length = animals.length;
		int randomIndex = (int) (Math.random() * length); // [0.0, 5.0)
		String randomAnimal = animals[randomIndex];
		System.out.println("Random animal: " + randomAnimal);
	}
}
public class CountAlgorithm{
	public static void main(String[] args){
		String[] animals = {"cat", "dog", "cat", "tiger", "lion"};

		int counter = 0;
		for(int i = 0; i < animals.length; i++){
			if(animals[i].equals("cat")){
				counter = counter + 1;
			}
		}
		System.out.println(counter + "cats");
	}
}
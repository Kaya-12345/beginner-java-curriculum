public class SearchArray{
	public static void main(String[] args){
		String[] fruits = {"dragonfruit", "banana", "apple", "kiwi", "strawberry"};

		boolean found = false;
		int index = -1;

		for(int i = 0; i < fruits.length; i++){ // Got through each item in the array
			if(fruits[i].equals("apple")){ // If the current item is apple
				found = true; // Mark as found
				index = i; // Save the index
				break; // Exit the loop after finding
			}
		}
		if(found == true){
			System.out.println("Found apple at " + index);
		}else{
			System.out.println("No apples in the array");
		}
	}
}
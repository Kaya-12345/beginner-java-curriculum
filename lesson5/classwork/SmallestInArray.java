public class SmallestInArray{
	public static void main(String[] args){
		int[] nums = {1, 2, 3, 20, 4};
		
		int smallest = nums[0]; // Start by assuming the first item is the smallest
		for(int i = 0; i < smallest.length; i++){ // Go through each item in the array
			if(nums[i] < smallest){ // If we find something smaller, update our guess
				smallest = nums[i];
			}
		}
		System.out.println("The smallest item: " + smallest);
	}
}
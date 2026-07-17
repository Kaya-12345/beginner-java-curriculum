public class BiggestInArray{
	public static void main(String[] args){
		int[] nums = {1, 2, 3, 20, 4};
		
		int biggest = nums[0]; // Start by assuming the first item is the biggest
		for(int i = 0; i < nums.length; i++){ // Go through each item in the array
			if(nums[i] > biggest){ // If we find something bigger, update our guess
				biggest = nums[i];
			}
		}
		System.out.println("The biggest item: " + biggest);
	}
}
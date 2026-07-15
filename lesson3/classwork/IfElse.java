public class IfElse{
	public static void main(String[] args){
		// if statement: runs only when a condition is true
		int age = 19;
		
		if (age >= 18){
			System.out.println("You can vote!");
		}
		System.out.println("Vote check complete.");

		// if/else: choose one of two paths
		boolean isRaining = true;

		if (isRaining == true){
			System.out.println("You should stay inddors.");
		} else {
			System.out.println("You can go outside!");
		}		
		
		// if/else if/else: handle multiple specific cases
		int score = 94;
		
		if(score >= 90){
			System.out.println("A");
		} else if(score >= 80){
			System.out.println("B");
		} else if(score >= 70){
			System.out.println("C");
		} else if(score >= 60){
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
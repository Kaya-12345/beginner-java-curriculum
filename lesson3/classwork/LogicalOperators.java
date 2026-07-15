public class LogicalOperators{
	public static void main(String[] args){
		int temperature = 75;
		String isSunny = "yes:;

		// && - And: both conditions must be true.
		if (temperature >= 80 && isSunny.equals("yes")){
			System.out.println("It is a great day for a picnic.");
		} else {
			System.out.println("It may not be a good day for a picnic.");
		}

		// || - OR: at least one condition must be true.
		String hasCar = "no";
		String hasBike = "yes";
		if (hasCar.equals("yes") || hasBike.equals("yes")){
			System.out.println("you have a way to get to school.");
		} else {
			System.out.println("You do not have a way to get to school.");
		}

		// ! - Not: reverses the result of the condition
		String homeworkDone = "yes";
		if(!(homeworkDone.equals("yes"))){
			System.out.println("Please do your homework.");
		} else {
			System.out.println("Your homework is already done.");
		}
	}
}
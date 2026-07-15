public class Divisibility{
	public static void main(String[] args){
		in num = 15;

		if(num % 3 == 0){
			System.out.println("Number is divisible by 3!");
		}

		if(num % 5 == 0){
			System.out.println("Number is divisible by 5!");
		}

		if(num % 2 == 0){
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}
	}
}
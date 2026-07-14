import java.util.Scanner;

public class InputCasting{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Give me your age: ");
		String ageText = scanner.nextLine();
		int age = Integer.parseInt(ageText);

		System.out.println(age + 1);

		System.out.print("Give me your height: ");
		double height = scanner.nextDouble();
		System.out.println(height);

		System.out.print("Give me your weight: ");
		int weight = scanner.nextInt();
		System.out.println(weight);
	}
}
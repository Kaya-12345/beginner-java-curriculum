import java.utill.Scanner;

public class ScannerInput{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = scanner.nextLine();

		System.out.println("Hello " + name + "!");

		System.out.print("What is your favorite animal? ");
		String animal = scanner.nextline();

		System.out.println("I also like. " + animal + ".");
	}
}
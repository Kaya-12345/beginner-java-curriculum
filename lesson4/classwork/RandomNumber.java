public class RandomNumber{
	public static void main(String[] args){
		System.out.println(Math.random()); // [0.0, 1.0)
		double num = Math.random() * 11; // [0.0, 11.0)
		System.out.println(num);
		int integerNum = (int) num;
		System.out.println(integerNum);
	}
}
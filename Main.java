import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the serial # of the book you want to purchase? ");
		int booknum = scan.nextInt();

	}
	

	public static boolean bookStore(int booknum) {
		int[] inventory = { 125, 109, 985 };

		if (booknum == 109) {
			return true;
		} else {
			return booknum();
		}
	}
}
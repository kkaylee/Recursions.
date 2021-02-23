import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is the serial # of the book you want to purchase? ");
	int serialnum = scan.nextInt();
	findBook(serialnum);
	}
	static boolean findBook(int serialnum) {
		Scanner scan = new Scanner(System.in);
		if (serialnum == 109) {
			System.out.println("Looks like we found the book you're looking for!");
			return true;
		} else {
			System.out.println("Oop! Looks like we can't find the book you're looking for. Can you give us a different serial #");
			serialnum = scan.nextInt();
			return findBook(serialnum);
		}
	}

}
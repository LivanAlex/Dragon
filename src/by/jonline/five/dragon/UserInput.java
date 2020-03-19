package by.jonline.five.dragon;

import java.util.Scanner;

abstract class UserInput {
	
	private static Scanner sc = new Scanner(System.in);
		
	protected static int getInteger() {
		int userInput = 0;
		System.out.print(">>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("\nЧто-то пошло не так, попробуйте еще раз: \n>>");
		}
		
		userInput = sc.nextInt();
		return userInput;
	}
	
	protected static String getString() {
		String userInput = "";
		while (!sc.hasNextLine()) {
			sc.next();
		}
		userInput = sc.nextLine();
		return userInput;
	}
}

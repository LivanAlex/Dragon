package by.jonline.five.dragon;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	private ArrayList<Menu> mainMenu = new ArrayList<>();
	private static MainMenu instance;
	
	private MainMenu() {
	}
	
	public static MainMenu getInstance() {
		if (instance == null) {
			instance = new MainMenu();
		}
		return instance;
	}
	
	public void add(Menu menu) {
		mainMenu.add(menu);
	}
	
	public void run() {
		showMenu();
		int choose = userInput();
		while (choose != 0) {
			mainMenu.get(choose-1).run();
			showMenu();
			choose = userInput();
		}
	}

	private void showMenu() {
		for (int i = 0; i < mainMenu.size(); i++) {
			System.out.printf("%d) %s. ", i+1 , mainMenu.get(i).name);
		}
		System.out.println("0. Выход");
	}
	
	
	
	private int userInput() {
		int userInput = 0;
		userInput = UserInput.getInteger();
		while (userInput < 0 || userInput > mainMenu.size()) {
			System.out.println("Повторите ввод:");
			userInput = UserInput.getInteger();
		}
		return userInput;
	}
	
	
}

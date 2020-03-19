package by.jonline.five.start;

import java.util.Random;

import by.jonline.five.dragon.Cave;
import by.jonline.five.dragon.Dragon;
import by.jonline.five.dragon.MainMenu;
import by.jonline.five.dragon.Menu;
import by.jonline.five.dragon.Treasure;

public class Start {

	public static void main(String[] args) {
		
		Dragon dragon = new Dragon();
		Cave cave = new Cave(dragon);
		
		for (int i = 0; i < 100; i++) {
			String tr = "сокровище";
			int price = new Random().nextInt(100);
			Treasure temp = new Treasure(tr + i, price);
			cave.add(temp);
		}
		
		MainMenu menu = MainMenu.getInstance();
		menu.add(new Menu("Просмотр сокровищ") {
			@Override
			public void run() {
				dragon.showAll();
				
			}
		});

		menu.add(new Menu("Выбор самого дорогого по стоимости сокровища") {

			@Override
			public void run() {
				dragon.chooseMostExpensive();
				
			}
		});
		
		menu.add(new Menu("Выбор сокровищ на заданную сумму") {

			@Override
			public void run() {
				dragon.chooseTreasure();
			}
		});
		
		menu.run();
		
	}
}

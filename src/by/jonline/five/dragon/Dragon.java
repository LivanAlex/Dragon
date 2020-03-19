package by.jonline.five.dragon;


public class Dragon {
	
	private Cave cave;
	
	protected void setCave(Cave cave) {
		this.cave = cave;
	}
	
	public void showAll () {
		System.out.println("\nСписок всех сокровищ:");
		for(Treasure t :cave.getTreasures()) {
			System.out.printf("%s %s\n", t.getName(), t.getPrice());
		}
		System.out.println();
	}
	
	public void chooseMostExpensive() {
		int max;
		String name = "";
		max = Integer.MIN_VALUE;
		for(Treasure t :cave.getTreasures()) {
			if(t.getPrice() > max) {
				max = t.getPrice();
				name = t.getName();
			}
		}
		String message = "Выбрано самое дорогое сокровище:\n";
		System.out.printf("\n%s%s %d\n\n", message, name, max);
	}
	
	public void chooseTreasure() {
		System.out.println("\nВведите сумму:");
		int sum = UserInput.getInteger();
		while (sum < 0) {
			System.out.println("Введите положительную сумму:");
			sum = UserInput.getInteger();
		}
		
		
		String name = "";
		for(Treasure t :cave.getTreasures()) {
			if(t.getPrice() == sum) {
				name += t.getName() + "\n";
			}
		}
		if (name.length() != 0 ) {
			String message = "\nВыбраны сокровища на сумму " + sum + ":\n";
			System.out.printf("%s%s\n", message, name);
		} else {
			String message = "\nНа сумму %d не найдено ни одного сокровища!\n\n";
			System.out.printf(message, sum);
		}
	}
}

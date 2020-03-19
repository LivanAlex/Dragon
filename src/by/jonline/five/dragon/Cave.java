package by.jonline.five.dragon;

public class Cave {
	private Treasure[] treasures;
	private int counter;
	
	public Cave(Dragon owner) {
		treasures = new Treasure[100];
		owner.setCave(this);
	}
	
	public void add(Treasure treasure) {
		if(counter < 100) {
			treasures[counter++] = treasure;
		}
	}
	
	public Treasure[] getTreasures() {
		return treasures;
	}
}

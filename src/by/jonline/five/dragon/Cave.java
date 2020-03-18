package by.jonline.five.dragon;

public class Cave {
	private Treasure[] treasures;
	private Dragon owner;
	private int counter;
	
	public Cave(Dragon owner) {
		treasures = new Treasure[100];
		this.owner = owner;
	}
	
	public void add(Treasure treasure) {
		if(counter < 100) {
			treasures[counter++] = treasure;
		}
	}
	
	public Treasure[] getTreasures() {
		return treasures;
	}
	
	public Dragon getOwner() {
		return owner;
	}
}

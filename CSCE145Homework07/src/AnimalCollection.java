/*
 * Written by Andrew Davison
 */
public class AnimalCollection {
	private Animal[] animals;
	
	public AnimalCollection() {
		this.animals = new Animal[10];
	}
	public void addAnimal(Animal aA) {
		for (int i=0;i < animals.length;i++) {
			animals[i] = aA;
		}
	}
	public void removeAnimal(String name) {
		
	}
	public void printAnimals() {
		
	}

}

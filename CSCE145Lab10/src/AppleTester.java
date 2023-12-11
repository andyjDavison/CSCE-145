/*
 * Written by Andrew Davison
 */
public class AppleTester {

	public static void main(String[] args) {
		System.out.println("Welcome to Apple Tester");
		
		Apple apple1 = new Apple();//test first apple
		System.out.println("\nCreating a default apple");
		System.out.println("Printing the default apple's value\n"+apple1.getType()+" "+apple1.getWeight()+" "+apple1.getPrice());
		
		Apple apple2 = new Apple("Granny Smith", .75, .99);
		System.out.println("\nCreating another apple\nSetting the apple's values to \"Granny Smith 0.75 0.99");
		System.out.println("Printing newest apple's values\n"+apple2);
		
		Apple apple3 = new Apple();//testing third apple
		System.out.println("\nCreating another default apple\nThen setting the new apple's values to \"iPad 2.5 -200\"");
		apple3.setType("iPad");
		apple3.setWeight(2.5);
		apple3.setPrice(-200);
		System.out.println("Printing the newest apple's values which shouldn't have changed\n"+apple3);
		
		System.out.println("\nChecking to see if the first and last apple have the same values.\n"+apple1.equals(apple3));//testing .equals
		

	}

}

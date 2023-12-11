/*
 * Written by Andrew Davison
 */
public class StringHelperTester {

	public static void main(String[] args) {
		run();
	}
	public static void run()
	{
		System.out.println("Welcome to String Helper.");
		System.out.println(StringHelper.hasAllUniqueCharacters("abc"));
		System.out.println(StringHelper.meshStrings("helooooo", "penis"));
		System.out.println(StringHelper.replaceVowelsWithOodle("penis"));
		System.out.println(StringHelper.weight("light"));
	}

}

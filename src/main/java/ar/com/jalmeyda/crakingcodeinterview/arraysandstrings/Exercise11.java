package ar.com.jalmeyda.crakingcodeinterview.arraysandstrings;

/**
 * Created by Juan Almeyda on 8/10/2016.
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */
public class Exercise11 {

	public static void main(String[] args) {
		System.out.println(isUnique("asdfghjklñ"));
	}

	private static boolean isUnique(String isUnique) {
		for (int i = 0; i < isUnique.length(); i++) {
			for (int j = i+1; j < isUnique.length(); j++) {
				if (isUnique.charAt(i) == isUnique.charAt(j))
					return false;
			}
		}
		return true;
	}
}

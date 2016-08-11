package ar.com.jalmeyda.crakingcodeinterview.arraysandstrings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Juan Almeyda on 8/10/2016.
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
public class Exercise12 {

	public static void main(String[] args) {
		System.out.println(oneIsPermutationOfTheAnother("juan","nauj"));
		System.out.println(oneIsPermutationOfTheAnother("ajuuna","naujau"));
		System.out.println(oneIsPermutationOfTheAnother("ajuuna","ajuana"));
	}

	private static boolean oneIsPermutationOfTheAnother(String one, String another) {
		if (permutation(one).contains(another))
			return true;
		return false;
	}

	private static List<String> permutation(String str) {
		return permutations(str, "",new LinkedList<>());
	}

	private static List<String> permutations(String str, String prefix, List<String> permutations) {
		if (str.length() == 0) {
			permutations.add(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutations(rem, prefix + str.charAt(i),permutations);
			}
		}
		return permutations;
	}

}

package ar.com.jalmeyda.crakingcodeinterview.arraysandstrings;

/**
 * Created by Juan Almeyda on 8/10/2016.
 * String Rotation:Assumeyou have a method isSubstringwhich checks if one word is a substring
 * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
 */
public class Exercise19 {

	public static void main(String[] args) {
		System.out.println(isSubstring("waterbottle", "erbottlewat"));
		System.out.println(isSubstring("waterbottle", "erbotltewat"));
	}

	private static boolean isSubstring(String one, String another) {
		if (one.length() != another.length())
			return false;

		for (int i = 0; i < one.length(); i++){
			if (one.equals(another.substring(i) + another.substring(0,i)))
				return true;
		}

		return false;
	}


}

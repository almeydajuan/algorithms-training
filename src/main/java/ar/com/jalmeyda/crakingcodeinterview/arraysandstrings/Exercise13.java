package ar.com.jalmeyda.crakingcodeinterview.arraysandstrings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Juan Almeyda on 8/10/2016.
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 */
public class Exercise13 {

	public static void main(String[] args) {
		System.out.println(urlfy("Mr John Smith   "));
	}

	private static String urlfy(String url) {
		StringBuilder urlfy = new StringBuilder();
		for (int i = 0; i < url.length(); i++){
			if (isEmpty(url.substring(i))) {
				return urlfy.toString();
			} else if (url.substring(i,i+1).equals(" ")) {
				urlfy.append("%20");
			} else {
				urlfy.append(url.charAt(i));
			}
		}
		return urlfy.toString();
	}

	private static boolean isEmpty(String substring) {
		for (int i = 0; i < substring.length(); i++){
			if (!substring.substring(i,i+1).equals(" "))
				return false;
		}
		return true;
	}
}

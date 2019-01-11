package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Question 3.
 * <p>Write a function to remove duplicate characters from a string</p>
 */
public class DuplicateUtil {

	private static final String EMPTY = "";

	/*
	 * Use functional programming to stream the value and collect.
	 */
	private static String removeDuplicatesChar1(String inputString) {
		return Arrays.asList(inputString.split(EMPTY)).stream().distinct().collect(Collectors.joining());
	}

	/*
	 * Use functional programming to iterate the loop and append distinct value.
	 */
	private static String removeDuplicatesChar2(String inputString) {
		StringBuilder stringBuffer = new StringBuilder();
		inputString.chars().distinct().forEach(c -> stringBuffer.append((char) c));
		return stringBuffer.toString();
	}

	/*
	 * repeated characters can be eliminated by sorting our input string to group
	 * duplicates. In order to do that, we have to convert the string to a char
	 * array and sort it using the Arrays static method sort. Finally, we will
	 * iterate over the sorted char array.
	 */
	private static String removeDuplicatesChar3(String inputString) {
		StringBuilder stringBuffer = new StringBuilder();
		if (!inputString.isEmpty()) {
			char[] chars = inputString.toCharArray();
			Arrays.sort(chars);

			stringBuffer.append(chars[0]);
			for (int i = 1; i < chars.length; i++) {
				if (chars[i] != chars[i - 1]) {
					stringBuffer.append(chars[i]);
				}
			}
		}
		return stringBuffer.toString();
	}

	public static void main(String[] args) {
		String name = "aaaabbbccdexxaaaa";
		System.out.println(removeDuplicatesChar1(name));
		System.out.println(removeDuplicatesChar2(name));
		System.out.println(removeDuplicatesChar3(name));
	}
}
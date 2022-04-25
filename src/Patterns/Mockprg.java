package Patterns;

import java.util.LinkedHashSet;

public class Mockprg {
	public static void main(String[] args) {

		String str = "abcdabcdabcdabcd";
		System.out.println(str);

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i));
			set.add(str.charAt(i));
			//System.out.println(set);
		}

		for (Character ch : set) {

			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					System.out.print(ch);
				}

			}

		}
	}
}

package com.masai1;

import java.util.regex.Pattern;

public class Main1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("Hello how are you");
		for(String s1:s) {
			System.out.println(s1);
		}
	}
}

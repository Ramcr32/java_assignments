package com.masai1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Main {
	public static void main(String[] args) {
	
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbbabbaba");
		while (m.find()) {
			count++;
			System.out.println(m.start() + "------" + m.end() + "------" + m.group());
		}
		System.out.println("The no of occurences:" + count);
	}
}


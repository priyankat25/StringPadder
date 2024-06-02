package com.kodnest.stringpadder;

import java.util.Scanner;

public class StringPadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		char paddingChar = sc.next().charAt(0);
		int desiredLength = sc.nextInt();
		sc.close();
		
		String res = stringPadder(inputString, paddingChar, desiredLength);
		System.out.println(res);
	}

	
	public static String stringPadder(String inputString, char paddingChar, int desiredLength) {
		String str = "";
		int diff = desiredLength - inputString.length();
		int len = diff/2;
		for(int i=0; i<desiredLength; i++) {
			if(len != 0) {
				str = str + paddingChar;
				len--;
			}
			else if(len == 0) {
				str = str + inputString;
				break;
			}
		}
		for(int i=0; i<desiredLength; i++) {
			if(str.length() < desiredLength) {
				str = str + paddingChar;
				len--;
			}
		}
		return str;
	}
}

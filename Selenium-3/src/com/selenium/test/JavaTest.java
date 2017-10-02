package com.selenium.test;

public class JavaTest {

	public static void main(String[] args) {

		String Actual = "This is Actual String";

		System.out.println("The Actual String is : " + Actual);

		String[] stringarray = Actual.split(" ");
		String string0 = stringarray[0];
		String string1 = stringarray[1];
		String string2 = stringarray[2];
		String string3 = stringarray[3];

		String Final = string3.concat(" ").concat(string2).concat(" ").concat(string1).concat(" ").concat(string0);

		System.out.println("The final String is : " + Final);

		StringBuilder input1 = new StringBuilder();
		input1.append(Final);
		input1 = input1.reverse();

		System.out.println("Reverse string is : " + input1);

		String finalText = "Final";
		StringBuilder fn = new StringBuilder();
		fn.append(finalText);
		fn = fn.reverse();

		System.out.println("Text is : " + fn);

	}

}

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		// 1. Use each value of randomNumber to give the user a random compliment.
		
		String compliment = "";
		if (randomNumber == 0) {
			compliment = "You are very smart.";
		}
		if (randomNumber == 1) {
			compliment = "You look good.";
		}
		if (randomNumber == 2) {
			compliment = "You seem like a good person.";
		}
		if (randomNumber == 3) {
			compliment = "You have nice shoes.";
		}
		if (randomNumber == 4) {
			compliment = "I like your hat.";
		}
		for (int i = 0; i<10; i+=1) {
			System.out.println(compliment);
		}
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}

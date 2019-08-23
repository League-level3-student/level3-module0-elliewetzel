package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] names = {"kieu", "molly", "max", "evana", "ava"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		String s = "sara";
		names[2] = s;
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		String [] replace = {"dana", "asha", "audrey", "katheryn", "kate"};
		for(int i = 0; i< names.length; i++) {
		names[i] = replace[i];	
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < 5; i++) {
			System.out.println(names[i]);
		}
		//7. make an array of 50 integers
		int [] sets = new int[100];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < 100; i++) {
			Random r = new Random();
			sets[i] = r.nextInt(100);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestnumber = 100;
		for(int i = 0; i < sets.length; i++) {
			if(sets[i] < smallestnumber) {
				smallestnumber = sets[i];
			}
		}
		System.out.println(smallestnumber);
		//10 print the entire array to see if step 8 was correct
	for(int i = 0; i < 100; i++) {
		System.out.println(sets[i]);
	}
		//11. print the largest number in the array.
	int greatest = 100;
	for (int i = 0; i < sets.length; i++) {
		if (sets[i] > greatest) {
			greatest = sets[i];
		}
	}
	System.out.println(greatest);
		//12. print only the last element in the array
		System.out.println(sets[99]);
	}
}

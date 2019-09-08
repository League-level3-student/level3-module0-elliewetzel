package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	static String[] m = new String[4];
	static String a = "gato";
	static String b = "perro";
	static String c = "elefante";
	static String d = "nadar";
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		m[0] = a;
		m[1] = b;
		m[2] = c;
		m[3] = d;
		Printstrings(m);
		Reverse(m);
		Skip(m);
		Random(m);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void Printstrings(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void Reverse(String[] ph) {
		for(int i = ph.length-1; i > 0; i--) {
			System.out.println(ph[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void Skip(String[] e) {
		for(int i = 0; i < e.length; i++/*2*/) {
			System.out.println(e[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void Random(String[] q) {
		ArrayList <String> kate = new ArrayList<String>();
		Random r = new Random();
		for(int i = 0; i < q.length; i++) {
			kate.add(q[i]);
		}
		for(int i = kate.size()-1; i>0; i--) {
			System.out.println(kate.remove(r.nextInt(kate.size())));
		}
		}
		
	
}

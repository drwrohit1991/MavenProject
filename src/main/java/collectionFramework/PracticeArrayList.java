package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Store 10 integers in an ArrayList and print only the even numbers.
		List<Integer> number = new ArrayList<>();
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);
		number.add(15);
		number.add(16);
		number.add(17);
		number.add(18);
		number.add(19);
		number.add(20);
		
		System.out.println(number.size());
		System.out.println(number.get(6));
		System.out.println("Even numbers are");
		for (int num : number) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Grapes");
		System.out.println(fruits);
		System.out.println(fruits.size());

	}

}

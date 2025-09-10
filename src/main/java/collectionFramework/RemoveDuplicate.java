package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList – Remove Duplicates using Set
		List<String> names = new ArrayList<>();
		names.add("Rohit");
		names.add("Rohit");
		names.add("Mohit");
		names.add("Amit");

		Set<String> uniquenames = new HashSet<>(names);
		System.out.println(uniquenames);

		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.addFirst(5);
		numbers.addLast(30);

//		System.out.println("LinkedList elements:" + numbers);
		for (Integer num : numbers) {
			System.out.println(num);
		}

	
	}
}

package collectionFramework;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListInsertandIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LinkedList – Insert and Iterate
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.addFirst(5);
		numbers.addLast(30);

		System.out.println("LinkedList elements:");
		for (Integer num : numbers) {
			System.out.println(num);
		
	}

	// find duplicate
	int[] arr = { 4, 2, 7, 2, 5, 4, 9 };
	Set<Integer> seen = new HashSet<>();
	Set<Integer> duplicates = new HashSet<>();

	for(
	int num1:arr)
	{
		if (!seen.add(num1)) {
			duplicates.add(num1);
		}
	}

	System.out.println("Duplicate elements: "+duplicates);
}

}

package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment4_ArrayCollection {

	public static void main(String[] args) {
		// Create Lists with area of top 5 largest cities. Print the total area of the
		// 3rd and 4th cities combined.
		Map<String, Double> citiArea = new LinkedHashMap<>();

		citiArea.put("Delhi", 1484.0);
		citiArea.put("Banglore", 741.0);
		citiArea.put("Vizag", 681.96);
		citiArea.put("Hyderabd", 650.0);
		citiArea.put("Lucknow", 631.0);
		System.out.println(citiArea);

		List<String> city = new ArrayList<>(citiArea.keySet());
		List<Double> area = new ArrayList<>(citiArea.values());
		Double totalarea = area.get(2) + area.get(3);

		System.out.println("total area of " + city.get(2) + "  and  " + city.get(3) + totalarea);

// Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> touristAttractionsAndSize = new HashSet<String>();
		touristAttractionsAndSize.add("Empire State Building");
		touristAttractionsAndSize.add("Eiffel Tower");
		touristAttractionsAndSize.add("Anne Frank House");
		touristAttractionsAndSize.add("Basílica de la Sagrada Família");
		touristAttractionsAndSize.add("Cayman Crystal Caves");
		touristAttractionsAndSize.add("Colosseum");
		touristAttractionsAndSize.add("Louvre Museum");
		touristAttractionsAndSize.add("Gardens by the Bay");
		touristAttractionsAndSize.add("Duomo di Milano (Milan Cathedral)");
		touristAttractionsAndSize.add("Sheikh Zayed Grand Mosque");
		System.out.println(touristAttractionsAndSize + "\nSize:" + touristAttractionsAndSize.size());

//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.

		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int fifth = numbers[4];
		int sixth = numbers[5];

		double average = (fifth + sixth) / 2.0;
		System.out.println("Average of 5th and 6th value: " + average);
		
		
	//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		Map<String, Double> MovieGross = new LinkedHashMap<>();
		MovieGross.put("Avatar The Way of Water", 2.35 );
		MovieGross.put("Avatar", 2.92 );
		MovieGross.put("Avengers", 2.7 );
		MovieGross.put("Titanic", 2.8 );
		MovieGross.put("Startwars", 2.96 );
		
		List<String> movie = new ArrayList<>(MovieGross.keySet());
		System.out.println("third movie on the list. " + movie.get(2));
		
		
	}
}
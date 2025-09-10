package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> cities = new TreeSet<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Banglore");
		cities.add("Delhi");
		System.out.println(cities);
	}

}

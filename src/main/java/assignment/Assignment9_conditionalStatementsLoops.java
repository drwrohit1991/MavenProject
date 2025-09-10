package assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_conditionalStatementsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] employees = {"Alice johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};

Double[] emp1Data = {75000.0, 5.1, 4.2};
Double[] emp2Data = {68000.0, 3.1, 3.8};
Double[] emp3Data = {82000.0, 7.1, 4.5};
Double[] emp4Data = {90000.0, 10.2, 2.5};
Double[] emp5Data = {60000.0, 2.4, 3.5};

Map<String, Double[]> empData = new HashMap<>();
empData.put(employees[0], emp1Data);
empData.put(employees[1], emp2Data);
empData.put(employees[2], emp3Data);
empData.put(employees[3], emp4Data);
empData.put(employees[4], emp5Data);

Map<String, Double> hikeMap = new HashMap<>();
for (String emp : employees) {
    Double[] data = empData.get(emp);
    double hikePercentage = calculateHike(data[0], data[1], data[2]); // call common method
    hikeMap.put(emp, hikePercentage);
}

System.out.println("Hike Percentage for each employee:");
for(String emp : employees) {
	System.out.println(emp + ": " + hikeMap.get(emp) + "%");
}

}
	  public static double calculateHike(double baseSalary, double experience, double rating) {
	        double variablePayPercentage;
	        double bonus;
	        double reward = 0;

	        // Determine variable pay and bonus based on rating
	        if (rating >= 4) {
	            variablePayPercentage = 15;
	            bonus = 1500;
	        } else if (rating >= 3) {
	            variablePayPercentage = 10;
	            bonus = 1200;
	        } else {
	            variablePayPercentage = 3;
	            bonus = 300;
	        }

	        // Additional reward for employees with 5+ years of experience
	        if (experience >= 5) {
	            reward = 5000;
	        }

	        // Calculate total hike amount
	        double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;

	        // Return hike percentage
	        return (hike / baseSalary) * 100;
	    }
	}

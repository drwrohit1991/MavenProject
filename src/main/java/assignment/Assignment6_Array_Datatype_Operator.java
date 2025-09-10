package assignment;

public class Assignment6_Array_Datatype_Operator {

	public static void main(String[] args) {
		/*Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		store it into another array, after adding 10 marks identify the average marks of all students
		*/
		String [] students = {"Suresh", "Mahesh", "Naresh"};
		int [] marks = {75, 80, 82};
		
		
int [] updatedmarks = new int[3];
updatedmarks[0] = marks[0] + 10;
updatedmarks[1] = marks[1] + 10;
updatedmarks[2] = marks[2] + 10;

System.out.println(students [0] + " : " + updatedmarks[0] );
System.out.println(students [1] + " : " + updatedmarks[1] );
System.out.println(students [2] + " : " + updatedmarks[2] );

int avragemarks = (updatedmarks[0]+updatedmarks[1]+updatedmarks[2])/ updatedmarks.length;
System.out.println("Average marks is " +  avragemarks);
	}

}

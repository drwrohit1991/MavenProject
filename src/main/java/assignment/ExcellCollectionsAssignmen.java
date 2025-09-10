package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcellCollectionsAssignmen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> Student1map = new HashMap<String, String>();
		Student1map.put("Name", "John Doe");
		Student1map.put("Age", "twenty");
		Student1map.put("Gender", "Male");
		Student1map.put("RollNo", "SBA12345");
		Student1map.put("Grade", "A++");
		Student1map.put("Major", "Computer Science");
		Student1map.put("GPA", "A3.8");
		Student1map.put("Email", "John@exam.com");
		Student1map.put("PAN", "SDF654310");
		Student1map.put("Address", "123 elm");

		Map<String, String> Student2map = new HashMap<String, String>();
		Student2map.put("Name", "Jane Smith");
		Student2map.put("Age", "twenty two");
		Student2map.put("Gender", "FeMale");
		Student2map.put("RollNo", "SBA12346");
		Student2map.put("Grade", "B+");
		Student2map.put("Major", "Mathematics");
		Student2map.put("GPA", "A3.5");
		Student2map.put("Email", "Jane@exam.com");
		Student2map.put("PAN", "REW6543211");
		Student2map.put("Address", "456 oak");

		Map<String, String> Student3map = new HashMap<String, String>();
		Student3map.put("Name", "Mike Brown");
		Student2map.put("Age", "twenty two");
		Student3map.put("Gender", "Male");
		Student3map.put("RollNo", "SBA12347");
		Student3map.put("Grade", "A+");
		Student3map.put("Major", "Physics");
		Student3map.put("GPA", "A3.9");
		Student3map.put("Email", "Mike@exam.com");
		Student3map.put("PAN", "TRY654312");
		Student3map.put("Address", "789 pine st");

		//List<Map<String, String>> StudentList = new ArrayList<Map<String, String>>();
		//System.out.println(StudentList.size());

		Map<String, String> Emp1map = new HashMap<String, String>();
		Emp1map.put("Emp ID", "E001");
		Emp1map.put("Name", "Alice Green");
		Emp1map.put("Age", "Thirty");
		Emp1map.put("Gender", "FeMale");
		Emp1map.put("Department", "Engineering");
		Emp1map.put("Position", "Software Engineer");
		Emp1map.put("Salaryjor", "75k Pounds");
		Emp1map.put("Email", "Alice@example.com");
		Emp1map.put("PAN", "SDF6543210");

		Map<String, String> Emp2map = new HashMap<String, String>();
		Emp2map.put("Emp ID", "E002");
		Emp2map.put("Name", "BOB Johnson");
		Emp2map.put("Age", "Thirty Five");
		Emp2map.put("Gender", "Male");
		Emp2map.put("Department", "Marketing");
		Emp2map.put("Position", "Marketing Manager");
		Emp2map.put("Salaryjor", "85k Pounds");
		Emp2map.put("Email", "Bob@example.com");
		Emp2map.put("PAN", "REW6543213");

		Map<String, String> Emp3map = new HashMap<String, String>();
		Emp3map.put("Emp ID", "E003");
		Emp3map.put("Name", "Carol White");
		Emp3map.put("Age", "Twenty Eight");
		Emp3map.put("Gender", "FeMale");
		Emp3map.put("Department", "Sales");
		Emp3map.put("Position", "Sales Executive");
		Emp3map.put("Salaryjor", "65k Pounds");
		Emp3map.put("Email", "Carol@example.com");
		Emp3map.put("PAN", "REW6543214");
		
		//List<Map<String, String>> Emplist = new ArrayList<Map<String, String>>();
		//System.out.println(Emplist.size());
		
		Map<String, String> Product1map = new HashMap<String, String>();
		Product1map.put("Prod ID", "P001");
		Product1map.put("Name", "Laptop");
		Product1map.put("Category", "Electronic");
		Product1map.put("Price", "12k Pound");
		Product1map.put("Stock Quantity", "Not Available");
		Product1map.put("Supplier", "Tech Supplier");
		Product1map.put("Warranty", "2 years");
		Product1map.put("Rating", "4.5 star");
		Product1map.put("Manufacturing Date", "Aug 2023");
		Product1map.put("Expiry Date", "Aug 2028");
		
		Map<String, String> Product2map = new HashMap<String, String>();
		Product2map.put("Prod ID", "P002");
		Product2map.put("Name", "Desk Chair");
		Product2map.put("Category", "Furniture");
		Product2map.put("Price", "150k Pound");
		Product2map.put("Stock Quantity", "Two");
		Product2map.put("Supplier", "Office Depot");
		Product2map.put("Warranty", "1 years");
		Product2map.put("Rating", "4 star");
		Product2map.put("Manufacturing Date", "Sept 2024");
		Product2map.put("Expiry Date", "NA");
		
		Map<String, String> Product3map = new HashMap<String, String>();
		Product3map.put("Prod ID", "P003");
		Product3map.put("Name", "Coffe maker");
		Product3map.put("Category", "Litchen");
		Product3map.put("Price", "75k Pound");
		Product3map.put("Stock Quantity", "Two hundred");
		Product3map.put("Supplier", "Kitchen world");
		Product3map.put("Warranty", "6 month");
		Product3map.put("Rating", "4.2 star");
		Product3map.put("Manufacturing Date", "jan 2025");
		Product3map.put("Expiry Date", "Jan 2025");
		
		//List<Map<String, String>> Prodlist = new ArrayList<Map<String, String>>();
		//System.out.println(Prodlist.size());
		
		List<Map<String,String >> studentList = new ArrayList<Map<String,String >>();
		studentList.add (Student1map);
		studentList.add (Student2map);
		studentList.add (Student3map);
		System.out.println("Student List :"+studentList);
		
		List<Map<String,String >> empList = new ArrayList<Map<String,String >>();
		empList.add(Emp1map);
		empList.add(Emp2map);
		empList.add(Emp3map);
		System.out.println("Employee List :"+empList);
		
		List<Map<String,String >> productList = new ArrayList<Map<String,String >>();
		productList.add(Product1map);
		productList.add(Product2map);
		productList.add(Product3map);
		System.out.println("Product List :"+productList);
		
		Map<String,List<Map<String,String >>> data = new HashMap<String,List<Map<String,String >>>();
		data.put("StudentData",studentList);
		data.put("EmployeeData",empList);
		data.put("ProductData",productList);
		System.out.println("All Data List :"+data);
		System.out.println("Displaying Supplier Name of 2nd row ProductData: "+data.get("ProductData").get(1).get("Supplier"));
	}

}

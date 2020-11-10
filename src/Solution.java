import java.util.ArrayList;
import java.util.Collections;

/*
 * Sort Employee(Custom) Objects by its attributes.
 * Usage of Comparable<T> Interface and Collection.sort(-).
 */

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private String location;
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getLocation() {
		return location;
	}

	public Employee(int empId, String empName, String location) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
	}
	
	@Override
	public String toString(){
		return "\nempId:"+empId+" empName:"+empName+" location:"+location;
	}

	@Override
	public int compareTo(Employee emp) {
		
//		//Sort by empId - Ascending
//		int empId = emp.getEmpId(); 
//		return this.empId - empId;
		
		//Sort by empName - Ascending
		String empName = emp.getEmpName();
		return this.empName.compareTo(empName);
		
//		//Sort by location - Descending
//		String location = emp.getLocation();
//		return location.compareTo(this.location);
	}
}

public class Solution{
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee(5, "Swaroop", "Bangalore"));
		al.add(new Employee(2, "Sanaa", "Hyderabad"));
		al.add(new Employee(6, "Amit", "Chennai"));
		al.add(new Employee(1, "Kiran", "Kolkata"));
		
		//Before Sorting
		System.out.println(al);
		
		Collections.sort(al);
		
		//After Sorting
		System.out.println(al);
	}
}
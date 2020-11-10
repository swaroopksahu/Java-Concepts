import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Sort Employee(Custom) Objects by its attributes.
 * Usage of Comparable<T> Interface and Collection.sort(-).
 * 
 * Comparable<T>: By using Comparable interface, we can compare and sort by only one member(Ex: by Id or name or location.
 * Comparator<T>: By using Comparator interface, we can compare and sort by mutiple members by creating different classes and implement the Comparator Interface.
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
	public int compareTo(Employee emp) {
		
		//Sort by empId - Ascending
		int empId = emp.getEmpId(); 
		return this.empId - empId;
		
		/*
		 * //Sort by empName - Ascending 
		 * String empName = emp.getEmpName(); 
		 * return this.empName.compareTo(empName);
		 * 
		 * //Sort by location - Descending 
		 * String location = emp.getLocation(); 
		 * return location.compareTo(this.location);
		 */
	}	
	
	@Override
	public String toString(){
		return "\nempId:"+empId+" empName:"+empName+" location:"+location;
	}
}

class SortByEmpName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String empName1 = o1.getEmpName();
		String empName2 = o2.getEmpName();
		
		return empName1.compareTo(empName2);
	}
}

class SortByEmpLocation implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String location1 = o1.getLocation();
		String location2 = o2.getLocation();
		return location1.compareTo(location2);
	}
}

public class SortObjectsByAttributes{
	
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		
		al.add(new Employee(5, "Swaroop", "Bangalore"));
		al.add(new Employee(2, "Sanaa", "Hyderabad"));
		al.add(new Employee(6, "Amit", "Chennai"));
		al.add(new Employee(1, "Kiran", "Kolkata"));
		
		//Before Sorting
		System.out.println("Before sorting:\n" + al);
		
		//Sort by empId
		Collections.sort(al);
		System.out.println("\nSorted By empId:\n" + al);
		
		//Sort by empName
		Collections.sort(al, new SortByEmpName());
		System.out.println("\nSorted by empName:\n" + al);
		
		//Sort by empLocation
		Collections.sort(al, new SortByEmpLocation());
		System.out.println("\nSorted by empLocation:\n" + al);
	}
}
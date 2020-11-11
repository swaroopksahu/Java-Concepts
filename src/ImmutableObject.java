/*
 * 1. Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
 * 2. Make all fields final and private.
 * 3. Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final. A more sophisticated approach is to make the constructor private and construct instances in factory methods.
 * 4. If the instance fields include references to mutable objects, don't allow those objects to be changed:
 *		a. Don't provide methods that modify the mutable objects.
 *		b. Don't share references to the mutable objects. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
 */

final class Student {

	final private int id;
	final private String name;
	final private String location;

	public Student(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return this.name;
	}

	public String getLocation() {
		return location;
	}
	
	@Override
	public String toString() {
		return ("id:" + id + ", name:" + name + ", location:" + location);
	}
}

public class ImmutableObject {

	public static void main(String[] args) {
		Student s = new Student(1, "Swaroop", "Bangalore");
		System.out.println(s);
		System.out.println(s.getLocation());
	}
}
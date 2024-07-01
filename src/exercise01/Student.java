package exercise01;

public class Student {
	private String name;
	
	public Student() {
		this.name = "Unknown";
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Student name: " + name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Long");
		
		s1.printName();
		s2.printName();
	}
}
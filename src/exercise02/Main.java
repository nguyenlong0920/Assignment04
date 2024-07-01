package exercise02;

abstract class Parent {
	abstract void message();
}

class firstSubclass extends Parent {
	void message() {
		System.out.println("This is first subclass");
	}
}

class secondSubclass extends Parent {
	void message() {
		System.out.println("This is second subclass");
	}
}

public class Main {
	public static void main(String[] args) {
		Parent first = new firstSubclass();
		Parent second = new secondSubclass();
		
		first.message();
		second.message();
	}
}

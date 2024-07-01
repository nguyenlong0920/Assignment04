package exercise03;

public class Reverse implements CharSequence {
	private String text;

	public Reverse(String text) {
		this.text = text;
	}

	@Override
	public int length() {
		return text.length();
	}

	@Override
	public char charAt(int index) {
		return text.charAt(text.length() - index - 1);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		String reversed = toString();
		return reversed.subSequence(start, end);
	}

	@Override
	public String toString() {
		return new StringBuilder(text).reverse().toString();
	}

	public static void main(String[] args) {
		Reverse text = new Reverse("Select one of the sentences from this book to use as the data.");

		System.out.println("Method length(): " + text.length());
		System.out.println("Method charAt(): " + text.charAt(4));
		System.out.println("Method subSequance(): " + text.subSequence(6, 9));
		System.out.println("Method toString(): " + text.toString());
	}
}

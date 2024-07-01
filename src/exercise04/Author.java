package exercise04;

public class Author {
	private String name;
	private String email;
	private boolean isMale;
	
	public Author(String name, String email, boolean isMale) {
		this.name = name;
		this.email = email;
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMale() {
		return isMale;
	}

	@Override
	public String toString() {
		return name + " (" + (isMale ? "m" : "f") + ") " + "at " + email;
	}
	
}
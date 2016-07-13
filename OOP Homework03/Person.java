
class Person {
	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
	// No need to check about the correct inputing, because the check was made in the Setters.	
		setName(name);
		setAge(age);
		setMale(isMale);
	}

	protected void showPersonInfo() {
		System.out.print("Name: " + this.name);
		System.out.print(", age: " + this.age);
		if (this.isMale == true) {
			System.out.print(", gender: Male");
		} else {
			if (this.isMale == false) {
				System.out.print(", gender: Famale");
			}
		}
		System.out.println();
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		}
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	boolean isMale() {
		return isMale;
	}

	void setMale(boolean isMale) {
		this.isMale = isMale;
	}
}

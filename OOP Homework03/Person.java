
public class Person {
	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setMale(isMale);
	}

	protected void showPersonInfo() {
		System.out.print("name: " + name);
		System.out.print(", age: " + age);
		if (this.isMale == true) {
			System.out.print(", gender: Male");
		} else {
			if (this.isMale == false) {
				System.out.print(", gender: Famale");
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
}

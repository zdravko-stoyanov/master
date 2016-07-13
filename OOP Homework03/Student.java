
class Student extends Person {
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	protected void showStudentInfo() {
		// use overrided method
		this.showPersonInfo();
		System.out.println(", grade: " + getScore());
	}

	// Make override to remove syso new line at the end of the method from
	// original showPersonInfo()
	@Override
	protected void showPersonInfo() {
		System.out.print("Name: " + getName());
		System.out.print(", age: " + getAge());
		if (this.isMale() == true) {
			System.out.print(", gender: Male");
		} else {
			if (this.isMale() == false) {
				System.out.print(", gender: Famale");
			}
		}
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			if (score > 6) {
				this.score = 6;
			} else {
				if (score < 2) {
					this.score = 2;
				}
			}
		}
	}

}

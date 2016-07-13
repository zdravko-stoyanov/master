
class Employee extends Person {

	private static final int MIN_AGE_TO_WORK = 18;
	private static final double COEFICIENT_FOR_OVERTIME = 1.5;
	private static final int NORM_OF_WORKING_HOURS_PER_DAY = 8;
	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	double calculateOverTime(double hours) {
		if (getAge() < MIN_AGE_TO_WORK) {
			return 0;
		} else {
			double hourSalary = daySalary / NORM_OF_WORKING_HOURS_PER_DAY;
			if (hours > NORM_OF_WORKING_HOURS_PER_DAY) {
				double overTime = hours - NORM_OF_WORKING_HOURS_PER_DAY;
				return daySalary + (overTime * hourSalary * COEFICIENT_FOR_OVERTIME);
			} else {
				return daySalary;
			}
		}
	}

	protected void showEmployeeInfo() {

		this.showPersonInfo();
		if (getAge() >= 18) {
			System.out.println(", daily salary: " + daySalary + " BGN.");
		} else {
			daySalary = 0;
			System.out.println(", daily salary: " + daySalary + " BGN.");
		}
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

	double getDaySalary() {
		return daySalary;
	}

	void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}

}

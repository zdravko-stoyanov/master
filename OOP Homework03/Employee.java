
class Employee extends Person {

	private static final int MIN_AGE_TO_WORK = 18;
	private static final double COEFICIENT_FOR_OVERTIME = 1.5;
	private static final int NORM_OF_WORKING_HOURS_PER_DAY = 8;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
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
		showPersonInfo();
		System.out.println(", daily salary: " + daySalary + " BGN.");
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}

}

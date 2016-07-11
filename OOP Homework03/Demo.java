
class Demo {

	private static final int NULL_INDEXES_IN_ARRAY = 4;
	private static final int TWO_HOURS_OVERTIME = 10;

	public static void main(String[] args) {
		Person personOne = new Person("Jeniffer", 29, false);
		Person personTwo = new Person("Manol", 33, true);
		Student studentOne = new Student("Gosho", 23, true, 4.32);
		Student studentTwo = new Student("Penka", 22, false, 5.68);
		Employee employeeOne = new Employee("Giorgios", 26, true, 40.44);
		Employee employeeTwo = new Employee("Stephan", 18, true, 24.24);
		Person people[] = { personOne, personTwo, studentOne, studentTwo, employeeOne, employeeTwo, null, null, null, null };
		for (int index = 0; index < people.length-NULL_INDEXES_IN_ARRAY; index++) {
			if (people[index] instanceof Student){
				((Student)people[index]).showStudentInfo();
			} else {
				if (people[index] instanceof Employee){
					((Employee)people[index]).showEmployeeInfo();
				} else {
					people[index].showPersonInfo();
				}
			}

		}
		System.out.println("In case that every employee has 2 hours overtime, the daily salary would raise to: ");
		for (int index = 0; index < people.length-NULL_INDEXES_IN_ARRAY; index++) {
			if ((people[index].equals(employeeOne) || people.equals(employeeTwo))) {
				System.out.print(employeeOne.getName() + " has two hours overtime - "
						+ (employeeOne.calculateOverTime(TWO_HOURS_OVERTIME) - employeeOne.getDaySalary()) + " BGN");
				System.out.println(", Salary+overtime: " + employeeOne.calculateOverTime(TWO_HOURS_OVERTIME) + " BGN");
				System.out.print(employeeTwo.getName() + " has two hours overtime - "
						+ (employeeTwo.calculateOverTime(TWO_HOURS_OVERTIME) - employeeTwo.getDaySalary()) + " BGN");
				System.out.println(", Salary+overtime: " + employeeTwo.calculateOverTime(TWO_HOURS_OVERTIME) + " BGN");
			}
		}
	}
}


class Demo {

	private static final int TWO_HOURS_OVERTIME = 10;

	public static void main(String[] args) {
		Person personOne = new Person("Jeniffer", 29, false);
		Person personTwo = new Person("Manol", 33, true);
		Student studentOne = new Student("Gosho", 23, true, 4.32);
		Student studentTwo = new Student("Penka", 22, false, 5.68);
		Employee employeeOne = new Employee("Giorgios", 26, true, 40.44);
		Employee employeeTwo = new Employee("Stephan", 18, true, 24.24);
		Person people[] = { personOne, personTwo, studentOne, studentTwo, employeeOne, employeeTwo, null, null, null,
				null };
		for (int index = 0; index < people.length; index++) {
			if (people[index] == null) {
				break;
			}
			if (people[index] instanceof Student) {
				((Student) people[index]).showStudentInfo();
			} else {
				if (people[index] instanceof Employee) {
					((Employee) people[index]).showEmployeeInfo();
				} else {
					people[index].showPersonInfo();
				}
			}

		}
		for (int index = 0; index < people.length; index++) {
			if (people[index] == null) {
				break;
			}
			if (people[index] instanceof Employee) {
				Employee employee = (Employee) people[index];
				double overtimeExtraPay = (employee.calculateOverTime(TWO_HOURS_OVERTIME) - employee.getDaySalary());
				System.out.print(employee.getName() + " has 2 hours overtime - " + overtimeExtraPay + " BGN");
				System.out.println(", Salary+overtime: " + employee.calculateOverTime(TWO_HOURS_OVERTIME) + " BGN");
			}
		}
	}
}

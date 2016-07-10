
public class Demo {

	private static final int TWO_HOURS_OVERTIME = 10;

	public static void main(String[] args) {
		Person personOne = new Person("Jeniffer", 29, false);
		Person personTwo = new Person("Manol", 33, true);
		Student studentOne = new Student("Gosho", 23, true, 4.32);
		Student studentTwo = new Student("Penka", 22, false, 5.68);
		Employee employeeOne = new Employee("Giorgios", 26, true, 40.44);
		Employee employeeTwo = new Employee("Stephan", 18, true, 24.24);
		Person peopleImport[] = { personOne, personTwo, studentOne, studentTwo, employeeOne, employeeTwo };
		Person people[] = new Person[10];
		for (int index = 0; index < peopleImport.length; index++) {
			people[index] = peopleImport[index];
			if ((people[index].equals(personOne) || people.equals(personTwo))) {
				personOne.showPersonInfo();
				System.out.println();
				personTwo.showPersonInfo();
				System.out.println();
			} else {
				if ((people[index].equals(studentOne) || people.equals(studentTwo))) {
					studentOne.showStudentInfo();
					studentTwo.showStudentInfo();
				} else {
					if ((people[index].equals(employeeOne) || people.equals(employeeTwo))) {
						employeeOne.showEmployeeInfo();
						employeeTwo.showEmployeeInfo();
					}
				}
			}
		}
		for (int index = 0; index < peopleImport.length; index++) {
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

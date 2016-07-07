package Homework01;

public class StudentsGroup {
	private static final double SCHOLARSHIP_AMOUNT = 32.66;
	private static final double MIN_GRADE_FOR_SCHOLARSHIP = 4.90;
	private static final int MIN_LENGTH_OF_SUBJECT_NAME = 3;
	private static final int SIZE_OF_STUDENTS_GROUP = 5;
	String groupSubject;
	Student[] students;
	byte freePlaces;

	StudentsGroup() {
		this.students = new Student[SIZE_OF_STUDENTS_GROUP];
		this.freePlaces = SIZE_OF_STUDENTS_GROUP;
	}

	StudentsGroup(String subject) {
		this();
		if (subject.length() < MIN_LENGTH_OF_SUBJECT_NAME) {
			this.groupSubject = "Strange subject";
		} else {
			this.groupSubject = subject;
		}
	}

	void addStudent(Student student) {
		for (int index = 0; index < students.length; index++) {
			if (student.subject.equals(groupSubject) && students[index] == null) {
				this.students[index] = student;
				this.freePlaces--;
				break;

			}
		}
	}

	void emptyGroup() {
		Student[] newStudents = new Student[students.length];
		this.freePlaces = SIZE_OF_STUDENTS_GROUP;
		students = newStudents;
	}

	void theBestStudent() {
		double bestGrade = 0;
		String name = "";
		for (int index = 0; index < students.length - freePlaces; index++) {
			if (students[index].grade > bestGrade) {
				bestGrade = students[index].grade;
				name = students[index].name;
			}
		}
		System.out.println(name + " has highest grade - " + bestGrade);
	}

	void printStudentsInGroup() {
		for (int index = 0; index < students.length - freePlaces; index++) {
			double scholarship = students[index].recieveScholarship(MIN_GRADE_FOR_SCHOLARSHIP, SCHOLARSHIP_AMOUNT);
			System.out.println(students[index].name + ", " + students[index].age + " years, group: "
					+ students[index].subject + ", grade: " + students[index].grade + ", scholarship: " + scholarship);
		}
	}
}

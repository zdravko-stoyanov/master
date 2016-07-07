package Homework01;

public class Student {
	private static final int MAX_AGE_FOR_SCHOLARSHIP = 30;
	private static final int GRADUATED_COLLEGE = 5;
	private static final int FIRST_YEAR_IN_COLLEGE = 1;
	private static final int LAST_YEAR_IN_COLLEGE = 4;
	private static final int MIN_AGE_FOR_COLLEGE = 19;
	private static final int NO_MONEY = 0;
	private static final int MAX_GRADE = 6;
	private static final int MIN_GRADE = 2;
	private static final int MIN_NAME_LENGTH = 1;
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		grade = 4.0;
		yearInCollege = FIRST_YEAR_IN_COLLEGE;
		isDegree = false;
		money = NO_MONEY;
	}

	Student(String name, String subject) {
		this();
		if (name.length() < MIN_NAME_LENGTH) {
			this.name = "No name";
		} else {
			this.name = name;
		}
		this.subject = subject;
	}

	Student(String name, String subject, double grade) {
		this(name, subject);
		if (name.length() < MIN_NAME_LENGTH || name.equals(null)) {
			this.name = "No name";
		} else {
			this.name = name;
		}
		if (grade < MIN_GRADE) {
			this.grade = MIN_GRADE;
		} else {
			if (grade > MAX_GRADE) {
				this.grade = MAX_GRADE;
			} else {
				this.grade = grade;
			}
		}
		if (subject.length() < MIN_NAME_LENGTH || subject.equals(null)) {
			this.subject = "No subject";
		} else {
			this.subject = subject;
		}
	}

	Student(String name, String subject, double grade, int age, int yearInCollege) {
		this(name, subject, grade);
		if (age < MIN_AGE_FOR_COLLEGE) {
			this.age = MIN_AGE_FOR_COLLEGE;
			System.out.println("Minimum age to be student in University is 19.");
		} else {
			this.age = age;
		}
		if (yearInCollege < FIRST_YEAR_IN_COLLEGE) {
			this.yearInCollege = FIRST_YEAR_IN_COLLEGE;
		} else {
			if (yearInCollege > LAST_YEAR_IN_COLLEGE) {
				this.yearInCollege = LAST_YEAR_IN_COLLEGE;
			} else {
				this.yearInCollege = yearInCollege;
			}
		}
	}

	Student(String name, String subject, int age) {
		this(name, subject);
		if (age < MIN_AGE_FOR_COLLEGE) {
			this.age = MIN_AGE_FOR_COLLEGE;
			System.out.println("Minimum age to be student in University is 19.");
		} else {
			this.age = age;
		}
	}

	void upYear() {
		if (this.yearInCollege >= FIRST_YEAR_IN_COLLEGE && this.yearInCollege < GRADUATED_COLLEGE) {
			this.yearInCollege++;
		} else {
			if (this.yearInCollege == GRADUATED_COLLEGE) {
				this.isDegree = true;
			} else {
				if (this.yearInCollege < FIRST_YEAR_IN_COLLEGE) {
					this.yearInCollege = FIRST_YEAR_IN_COLLEGE;
					this.yearInCollege++;
				}
			}
		}
	}

	double recieveScholarship(double minGrade, double amount) {
		if (this.age > MIN_AGE_FOR_COLLEGE && this.age <= MAX_AGE_FOR_SCHOLARSHIP && this.grade >= minGrade) {
			return money += amount;
		}
		return money;
	}
}

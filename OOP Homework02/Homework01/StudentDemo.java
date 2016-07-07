package Homework01;

public class StudentDemo {

	private static final double MIN_GRADE_FOR_SCHOLARSHIP = 4.90;
	private static final int MAX_AGE_FOR_SCHOLARSHIP = 30;
	private static final int GRADUATED_COLLEGE = 5;
	private static final int LAST_YEAR_IN_COLLEGE = 4;
	private static final int FIRST_YEAR_IN_COLLEGE = 1;

	public static void main(String[] args) {
		Student pesho = new Student("Пешо", "itTalents");
		if (pesho.yearInCollege >= FIRST_YEAR_IN_COLLEGE && pesho.yearInCollege <= LAST_YEAR_IN_COLLEGE) {
			System.out.println(pesho.name + " е " + pesho.yearInCollege + " година в университета.");
		}
		pesho.upYear();
		if (pesho.isDegree == false && pesho.yearInCollege <= LAST_YEAR_IN_COLLEGE) {
			System.out.println("Догодина " + pesho.name + " ще е " + pesho.yearInCollege + " година в университета.");
		} else {
			if (pesho.isDegree == false && pesho.yearInCollege == GRADUATED_COLLEGE) {
				System.out.println("Тази година ще завърши.");
			} else {
				if (pesho.isDegree == true) {
					System.out.println(pesho.name + " е завършил.");
				}
			}
		}
		if (pesho.age < MAX_AGE_FOR_SCHOLARSHIP && pesho.grade >= MIN_GRADE_FOR_SCHOLARSHIP) {
			System.out.println(pesho.name + " има среден успех: " + pesho.grade
					+ ". В такъв случай от стипендии ще вземе " + pesho.recieveScholarship(MIN_GRADE_FOR_SCHOLARSHIP, MAX_AGE_FOR_SCHOLARSHIP) + "лв.");
		} else {
			if (pesho.age >= MAX_AGE_FOR_SCHOLARSHIP) {
				System.out.println(pesho.name + " няма да вземе стипендия, защото е чукнал тридесетака.");
			} else {
				if (pesho.grade < MIN_GRADE_FOR_SCHOLARSHIP) {
					System.out.println(
							pesho.name + " няма да вземе стипендия, защото го е мързяло да учи и има нисък успех.");
				}
			}
		}
	}
}

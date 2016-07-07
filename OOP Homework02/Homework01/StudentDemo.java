package Homework01;

public class StudentDemo {

	private static final double MIN_GRADE_FOR_SCHOLARSHIP = 4.90;
	private static final int MAX_AGE_FOR_SCHOLARSHIP = 30;
	private static final int GRADUATED_COLLEGE = 5;
	private static final int LAST_YEAR_IN_COLLEGE = 4;
	private static final int FIRST_YEAR_IN_COLLEGE = 1;

	public static void main(String[] args) {
		Student pesho = new Student("����", "itTalents");
		if (pesho.yearInCollege >= FIRST_YEAR_IN_COLLEGE && pesho.yearInCollege <= LAST_YEAR_IN_COLLEGE) {
			System.out.println(pesho.name + " � " + pesho.yearInCollege + " ������ � ������������.");
		}
		pesho.upYear();
		if (pesho.isDegree == false && pesho.yearInCollege <= LAST_YEAR_IN_COLLEGE) {
			System.out.println("�������� " + pesho.name + " �� � " + pesho.yearInCollege + " ������ � ������������.");
		} else {
			if (pesho.isDegree == false && pesho.yearInCollege == GRADUATED_COLLEGE) {
				System.out.println("���� ������ �� �������.");
			} else {
				if (pesho.isDegree == true) {
					System.out.println(pesho.name + " � ��������.");
				}
			}
		}
		if (pesho.age < MAX_AGE_FOR_SCHOLARSHIP && pesho.grade >= MIN_GRADE_FOR_SCHOLARSHIP) {
			System.out.println(pesho.name + " ��� ������ �����: " + pesho.grade
					+ ". � ����� ������ �� ��������� �� ����� " + pesho.recieveScholarship(MIN_GRADE_FOR_SCHOLARSHIP, MAX_AGE_FOR_SCHOLARSHIP) + "��.");
		} else {
			if (pesho.age >= MAX_AGE_FOR_SCHOLARSHIP) {
				System.out.println(pesho.name + " ���� �� ����� ���������, ������ � ������ �����������.");
			} else {
				if (pesho.grade < MIN_GRADE_FOR_SCHOLARSHIP) {
					System.out.println(
							pesho.name + " ���� �� ����� ���������, ������ �� � ������� �� ��� � ��� ����� �����.");
				}
			}
		}
	}
}

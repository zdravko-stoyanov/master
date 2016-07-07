package Homework01;

public class College {

	public static void main(String[] args) {
		Student pesho = new Student("Пешо", "itTalents", 4.13, 20, 1);
		Student gosho = new Student("Гошо", "itTalents", 5.88, 23, 2);
		Student koko = new Student("Коко", "Telerik", 4.90, 26, 3);
		Student strahil = new Student("Страхил", "itTalents", 5.22, 22, 4);
		Student raicho = new Student("Райчо", "Telerik", 5.01, 32, 4);
		StudentsGroup itTalents = new StudentsGroup();
		StudentsGroup telerik = new StudentsGroup();
		telerik.groupSubject = "Telerik";
		telerik.addStudent(pesho);
		telerik.addStudent(gosho);
		telerik.addStudent(koko);
		telerik.addStudent(strahil);
		telerik.addStudent(raicho);
		System.out.print("В групата на Telerik са: ");
		for (int index = 0; index < telerik.students.length - telerik.freePlaces; index++) {
			System.out.print(telerik.students[index].name + ". ");
		}
		itTalents.groupSubject = "itTalents";
		itTalents.addStudent(pesho);
		itTalents.addStudent(gosho);
		itTalents.addStudent(koko);
		itTalents.addStudent(strahil);
		itTalents.addStudent(raicho);
		System.out.println();
		System.out.print("В групата на IT Talents са: ");
		int count = 0;
		for (int index = 0; index < itTalents.students.length - itTalents.freePlaces; index++) {
			count++;
			System.out.print(itTalents.students[index].name + ". ");
		}
		System.out.println();
		System.out.print("В IT Talents са заети " + count + " места. ");
		if (itTalents.freePlaces > 1) {
			System.out.println("Остават още " + itTalents.freePlaces + " свободни места.");
		} else {
			if (itTalents.freePlaces == 1)
				System.out.println("Остава още само " + itTalents.freePlaces + " свободно място.");
		}
		itTalents.theBestStudent();
		System.out.println("Студенти в групата на IT Talents: ");
		itTalents.printStudentsInGroup();
		for (int index = 0; index < itTalents.students.length - itTalents.freePlaces; index++) {
			if (itTalents.students[index].yearInCollege >= 1 && itTalents.students[index].yearInCollege <= 4) {
				System.out.println(itTalents.students[index].name + " е " + itTalents.students[index].yearInCollege
						+ " година в университета.");
			}
			itTalents.students[index].upYear();
			if (itTalents.students[index].isDegree == false && itTalents.students[index].yearInCollege <= 4) {
				System.out.println("Догодина " + itTalents.students[index].name + " ще е "
						+ itTalents.students[index].yearInCollege + " година в университета.");
			} else {
				if (itTalents.students[index].isDegree == false && itTalents.students[index].yearInCollege == 5) {
					System.out.println("Тази година ще завърши.");
				} else {
					if (itTalents.students[index].isDegree == true) {
						System.out.println(itTalents.students[index].name + " е завършил.");
					}
				}
			}
		}

	}

}

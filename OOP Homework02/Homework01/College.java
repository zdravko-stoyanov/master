package Homework01;

public class College {

	public static void main(String[] args) {
		Student pesho = new Student("Pesho", "itTalents", 4.13, 20, 1);
		Student gosho = new Student("Gosho", "itTalents", 5.88, 23, 2);
		Student koko = new Student("Koko", "Telerik", 4.90, 26, 3);
		Student strahil = new Student("Strahil", "itTalents", 5.22, 22, 4);
		Student raicho = new Student("Raicho", "Telerik", 5.01, 32, 4);
		StudentsGroup itTalents = new StudentsGroup();
		StudentsGroup telerik = new StudentsGroup();
		telerik.groupSubject = "Telerik";
		telerik.addStudent(pesho);
		telerik.addStudent(gosho);
		telerik.addStudent(koko);
		telerik.addStudent(strahil);
		telerik.addStudent(raicho);
		System.out.print("Members of Telerik's group: ");
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
		System.out.print("Members of IT Talents's group: ");
		int count = 0;
		for (int index = 0; index < itTalents.students.length - itTalents.freePlaces; index++) {
			count++;
			System.out.print(itTalents.students[index].name + ". ");
		}
		System.out.println();
		System.out.print("Used places: " + count + ". ");
		if (itTalents.freePlaces > 1) {
			System.out.println("There are still " + itTalents.freePlaces + " free places.");
		} else {
			if (itTalents.freePlaces == 1)
				System.out.println("There is only " + itTalents.freePlaces + " place.");
		}
		itTalents.theBestStudent();
		System.out.println("Students in group of IT Talents: ");
		itTalents.printStudentsInGroup();
		for (int index = 0; index < itTalents.students.length - itTalents.freePlaces; index++) {
			if (itTalents.students[index].yearInCollege >= 1 && itTalents.students[index].yearInCollege <= 4) {
				System.out.println(itTalents.students[index].name + " is " + itTalents.students[index].yearInCollege
						+ " year in college.");
			}
			itTalents.students[index].upYear();
			if (itTalents.students[index].isDegree == false && itTalents.students[index].yearInCollege <= 4) {
				System.out.println("Next year " + itTalents.students[index].name + " will be "
						+ itTalents.students[index].yearInCollege + " year in college.");
			} else {
				if (itTalents.students[index].isDegree == false && itTalents.students[index].yearInCollege == 5) {
					System.out.println("This year He/She will graduate.");
				} else {
					if (itTalents.students[index].isDegree == true) {
						System.out.println(itTalents.students[index].name + " is graduated.");
					}
				}
			}
		}

	}

}

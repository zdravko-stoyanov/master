
public class TasksOfEmployer {

	public static void main(String[] args) {
		AllWork allWork = new AllWork();
		allWork.addTask(new Task("wash the floor", 8));
		allWork.addTask(new Task("clean the bath", 14));
		allWork.addTask(new Task("dig in the nose", 4));
		allWork.addTask(new Task("remove virus from the office's PC", 16));
		allWork.addTask(new Task("call some important customers", 6));
		allWork.addTask(new Task("to create new logo of the company", 4));
		allWork.addTask(new Task("recieve and arrange the new goods", 11));
		allWork.addTask(new Task("advertise the bussiness", 5));
		allWork.addTask(new Task("package a new articles", 8));
		allWork.addTask(new Task("go to a company training", 11));

		Employee[] employees = { new Employee("Petra"), new Employee("Katya"), new Employee("Ivan"),
				new Employee("Koko"), new Employee("Petra"), new Employee("Katya"), new Employee("Ivan"),
				new Employee("Koko") };

		int day = 1;
		while (true) {
			System.out.println("Day: " + day);
			for (int index = 0; index < employees.length; index++) {
				employees[index].setAllWork(allWork);
				employees[index].startWorkingDay();
				employees[index].work();
			}
			if (allWork.isAllWorkDone() == true) {
				System.out.println("All work is done");
				break;
			}
			day++;
			System.out.println();
		}
		for (int index = 0; index < employees.length; index++) {
			String[] names = { employees[index].getName() };
			for (int i = index + 1; i < employees.length; i++) {
				if (employees[i].getName().compareTo(employees[index].getName()) < 0) {
					String temp = employees[index].getName();
					employees[index].setName(employees[i].getName());
					employees[i].setName(temp);
				}
			}
			System.out.print(employees[index].getName() + " ");
		}
	}
}
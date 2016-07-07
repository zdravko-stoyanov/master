package Homework02;

public class TaskOfEmployer {

	public static void main(String[] args) {
		Employee firstWorker = new Employee("Патрисио");
		Employee secondWorker = new Employee ("Асен");
		Employee thirdWorker = new Employee ("Джошуа");
		Task watering = new Task("да полива", 6);
		Task reaping = new Task("да жъне", 9);
		// В последната задача съм задал невалидна стойност, която да бъде заменяна с default-на.
		Task digging = new Task("да копа", -15);
		firstWorker.setCurrentTask(watering);
		secondWorker.setCurrentTask(reaping);
		thirdWorker.setCurrentTask(digging);
		firstWorker.setHoursLeft(8);
		secondWorker.setHoursLeft(7);
		thirdWorker.setHoursLeft(12);
		firstWorker.showReport();
		secondWorker.showReport();
		thirdWorker.showReport();

	}

}

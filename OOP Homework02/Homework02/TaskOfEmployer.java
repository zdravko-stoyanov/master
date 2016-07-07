package Homework02;

public class TaskOfEmployer {

	public static void main(String[] args) {
		Employee firstWorker = new Employee("Patricio");
		Employee secondWorker = new Employee ("Assen");
		Employee thirdWorker = new Employee ("Joshua");
		Task watering = new Task("watering", 6);
		Task reaping = new Task("reaping", 9);
		// At the last task I've inserted an invalid value so it should be replaced by the default value.
		Task digging = new Task("digging", -15);
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

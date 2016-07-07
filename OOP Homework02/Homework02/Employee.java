package Homework02;

class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;

	Employee(String name) {
		if (name != null && name != "") {
			this.name = name;
		}
		this.hoursLeft = 0;
	}

	void work() {
		if (currentTask.getWorkingHours() > hoursLeft) {
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
			hoursLeft = 0;
		} else {
			if (hoursLeft > currentTask.getWorkingHours()) {
				hoursLeft -= currentTask.getWorkingHours();
				currentTask.setWorkingHours(0);
			}
		}
	}

	void showReport() {
		System.out.println("Today " + this.name + " has work time - " + hoursLeft + " hours.");
		System.out.println(
				this.name + " has task " + currentTask.getName() + " - " + currentTask.getWorkingHours() + " hours.");
		work();
		System.out.println("There is still " + hoursLeft + " more work hours today.");
		if (currentTask.getWorkingHours() > 1) {
			System.out.println("To complete the task he should work " + currentTask.getWorkingHours() + " more hours.");
			System.out.println();
		} else {
			if (currentTask.getWorkingHours() == 1) {
				System.out.println("Needs " + currentTask.getWorkingHours() + " more hour to complete the task.");
				System.out.println();
			} else {
				if (currentTask.getWorkingHours() == 0) {
					System.out.println("The task " + currentTask.getName() + " is completed.");
					System.out.println();
				}
			}
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft > 0 && hoursLeft < 24) {
			this.hoursLeft = hoursLeft;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name != "") {
			this.name = name;
		}
	}

}

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
	
	void showReport(){
		System.out.println("Днес " + this.name + " има работно време - " + hoursLeft + " часа.");
		System.out.println(this.name + " има задача " + currentTask.getName() + " - " + currentTask.getWorkingHours() + " часа.");
		work();
		System.out.println("Остават му още " + hoursLeft + " работни часа.");
		if (currentTask.getWorkingHours()>1){
		System.out.println("Необходими са още " + currentTask.getWorkingHours() + " часа за да се изпълни задачата.");
		System.out.println();
		} else {
			if (currentTask.getWorkingHours()==1){
				System.out.println("Необходим e още " + currentTask.getWorkingHours() + " час за да се изпълни задачата.");
				System.out.println();
			} else {
				if (currentTask.getWorkingHours()== 0){
					System.out.println("Задачата " + currentTask.getName() + " е изпълнена.");
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


class Employee extends AllWork {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	Employee(String name) {
		setName(name);
	}

	void work() {
		while (this.hoursLeft > 0) {
			if (this.currentTask == null || this.currentTask.getWorkingHours() == 0) {
				this.currentTask = Employee.allWork.getNextTask();
				if (this.currentTask == null) {
					System.out.println(this.getName() + " has nothing to do.");
					break;
				}
				System.out.println(this.getName() + "'s task is to " + this.getCurrentTask().getName());
				this.activityDuringDay();
			} else {
				System.out.println(this.getName() + " continue with the task to " + this.getCurrentTask().getName());
				this.activityDuringDay();
			}
		}

	}

	void activityDuringDay() {
		if (this.getHoursLeft() < this.currentTask.getWorkingHours()) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeft());
			this.setHoursLeft(0);
			System.out.println(this.getName() + " finished work for today!");
			System.out.println(this.getName() + " has " + this.getCurrentTask().getWorkingHours()
					+ " more hours until the end of the current task!");

		}
		if (this.getHoursLeft() >= this.currentTask.getWorkingHours()) {
			this.setHoursLeft(this.getHoursLeft() - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
			System.out.println(this.getName() + " finished work on " + this.getCurrentTask().getName());
			System.out.println(this.getName() + " has " + this.getHoursLeft() + " more hours until end of the day!");
		}
	}

	void startWorkingDay() {
		this.setHoursLeft(8);
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			this.hoursLeft = 0;
		}
	}

	public AllWork getAllWork() {
		return Employee.allWork;
	}

	public void setAllWork(AllWork allWork) {
		if (allWork != null) {
			Employee.allWork = allWork;
		}
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			this.name = "The name is wrong";
		}
	}
}
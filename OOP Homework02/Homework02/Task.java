package Homework02;

class Task {
	private static final int HOURS_IN_ONE_DAY = 24;
	private String nameOfTask;
	private int workingHours;

	Task() {
		this.nameOfTask = "Няма задача";
		this.workingHours = 0;
	}
	
	Task (String nameOfTask, int workingHours){
		if (nameOfTask!=null && nameOfTask!=""){
			this.nameOfTask = nameOfTask;
		} else {
			this.nameOfTask = "Няма задача";
		}
		if (workingHours > 0){
			this.workingHours = workingHours;
		} else {
			this.workingHours = 0;
		}
	}

	public String getName() {
		return this.nameOfTask;
	}

	public void setName(String name) {
		if (name != null && name != "") {
			this.nameOfTask = name;
		}
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0 && workingHours<HOURS_IN_ONE_DAY) {
			this.workingHours = workingHours;
		} else {
			this.workingHours = 0;
		}
	}

}

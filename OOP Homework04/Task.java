

class Task {
	private static final int HOURS_IN_ONE_DAY = 24;
	private String name;
	private int workingHours;
	
	Task (String name, int workingHours){
		if (!name.equals(null) && !name.trim().equals("")){
			this.name = name;
		} else {
			this.name = "There is no current task";
		}
		if (workingHours > 0){
			this.workingHours = workingHours;
		} else {
			this.workingHours = 0;
		}
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (!name.equals(null) && !name.trim().equals("")) {
			this.name = name;
		} else {
			this.name = "There is no current task";
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

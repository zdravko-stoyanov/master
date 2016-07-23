
	class AllWork {
	private static final int MAX_FREE_PLACES_FOR_TASK = 10;
	private Task[] tasks;
	private int freePlacesForTasks = 10;
	private int currentUnnasignedTask = 0;
	private int taskIndex;
	
	public AllWork(){
		this.tasks = new Task[getFreePlacesForTasks()];
	}
	
	public void addTask(Task task){
		if(task != null && freePlacesForTasks >= 1){
			tasks[currentUnnasignedTask] = task;
			freePlacesForTasks--;
			currentUnnasignedTask++;
		}
	}
	
	Task getNextTask(){
		if(taskIndex < currentUnnasignedTask){
			return this.tasks[taskIndex++];
		}
		return null;
	}
	
	public boolean isAllWorkDone(){
		for (int work = 0; work < currentUnnasignedTask; work++) {
			if(tasks[work].getWorkingHours() > 0){
				return false;
			}
		}
		return true;
	}

	public Task[] getTasks(){
		return tasks;
	}
	
	public void setTasks(Task[] tasks) {
		if (tasks != null) {
			this.tasks = tasks;
		}
	}
	
	
	public int getCurrentUnassignedTask() {
		return this.currentUnnasignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		if (currentUnassignedTask >= 0 && currentUnassignedTask <= 9) {
			this.currentUnnasignedTask = currentUnassignedTask;
		}
	}
	

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		if (freePlacesForTasks >=1 && freePlacesForTasks <= MAX_FREE_PLACES_FOR_TASK){
		this.freePlacesForTasks = freePlacesForTasks;
		} else {
			System.out.println("Wrong value for free places!");
		}
	}
}
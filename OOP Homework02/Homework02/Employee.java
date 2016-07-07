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
		System.out.println("���� " + this.name + " ��� ������� ����� - " + hoursLeft + " ����.");
		System.out.println(this.name + " ��� ������ " + currentTask.getName() + " - " + currentTask.getWorkingHours() + " ����.");
		work();
		System.out.println("������� �� ��� " + hoursLeft + " ������� ����.");
		if (currentTask.getWorkingHours()>1){
		System.out.println("���������� �� ��� " + currentTask.getWorkingHours() + " ���� �� �� �� ������� ��������.");
		System.out.println();
		} else {
			if (currentTask.getWorkingHours()==1){
				System.out.println("��������� e ��� " + currentTask.getWorkingHours() + " ��� �� �� �� ������� ��������.");
				System.out.println();
			} else {
				if (currentTask.getWorkingHours()== 0){
					System.out.println("�������� " + currentTask.getName() + " � ���������.");
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

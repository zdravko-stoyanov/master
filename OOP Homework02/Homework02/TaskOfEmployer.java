package Homework02;

public class TaskOfEmployer {

	public static void main(String[] args) {
		Employee firstWorker = new Employee("��������");
		Employee secondWorker = new Employee ("����");
		Employee thirdWorker = new Employee ("������");
		Task watering = new Task("�� ������", 6);
		Task reaping = new Task("�� ����", 9);
		// � ���������� ������ ��� ����� ��������� ��������, ����� �� ���� �������� � default-��.
		Task digging = new Task("�� ����", -15);
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


public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isStarted;

	ElectronicSecuredNotepad(String password) {
		super(password);
		this.isStarted = false;
	}

	@Override
	public void start() {
		System.out.println("���������� �� ������������...");
		this.isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("���������� �� ������������...");
		this.isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void addText(int pageNumber, String text) {
		if (this.pages!=null && isStarted == true) {
			super.addText(pageNumber, text);
			System.out.println("���� ������� ����� �� " + pageNumber + " ��������.");
		} else {
			System.out.println("�� ���� �� �� ������ �����. ������������ � ������.");
		}
	}

	@Override
	void addText(int pageNumber, String text, String password) {
		if (isStarted == true) {
			super.addText(pageNumber, text, password);
			System.out.println("���� ������� ������� �����: \"" + text + " \" - �� " + pageNumber + " ��������.");
		} else {
			System.out.println("�� ���� �� �� ������ �����. ������������ � ������.");
		}
	}

	@Override
	void addText(int pageNumber, String title, String text, String password) {
		if (isStarted == true) {
			super.addText(pageNumber, title, text, password);
		} else {
			System.out.println("�� ���� �� �� ������ �����. ������������ � ������.");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isStarted == true) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("�� ���� �� �� ���� �����. ������������ � ������.");
		}
	}

	@Override
	void deleteText(int pageNumber, String password) {
		if (isStarted == true) {
			super.deleteText(pageNumber, password);
		} else {
			System.out.println("�� ���� �� �� ���� �����. ������������ � ������.");
		}
	}

	@Override
	public void overrideText(int pageNumber, String text) {
		if (isStarted == true) {
			super.overrideText(pageNumber, text);
		} else {
			System.out.println("�� ���� �� �� �������� �����. ������������ � ������.");
		}
	}

	@Override
	void overrideText(int pageNumber, String text, String password) {
		if (isStarted == true) {
			super.overrideText(pageNumber, text, password);
		} else {
			System.out.println("�� ���� �� �� �������� �����. ������������ � ������.");
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (isStarted == true) {
			return super.searchWord(word);
		}
		System.out.println("�� ���� �� �� ����� ����. ������������ � ������.");
		return false;
	}

	@Override
	boolean searchWord(String word, String password) {
		if (isStarted == true) {
			return super.searchWord(word, password);
		}
		System.out.println("�� ���� �� �� ����� ����. ������������ � ������.");
		return false;
	}

	@Override
	public void viewAllPages() {
		if (isStarted == true) {
			super.viewAllPages();
		} else {
			System.out.println("�� ���� �� ����. ������������ � ������.");
		}
	}

	@Override
	void viewAllPages(String password) {
		if (isStarted == true) {
			super.viewAllPages(password);
		} else {
			System.out.println("�� ���� �� ����. ������������ � ������.");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted == true) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("�� ���� �� ����. ������������ � ������.");
		}
	}

	@Override
	void printAllPagesWithDigits(String password) {
		if (isStarted == true) {
			super.printAllPagesWithDigits(password);
		} else {
			System.out.println("�� ���� �� ����. ������������ � ������.");
		}
	}
}

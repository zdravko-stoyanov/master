
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isStarted;

	ElectronicSecuredNotepad(String password) {
		super(password);
		this.isStarted = false;
	}

	@Override
	public void start() {
		System.out.println("Стартиране на устройството...");
		this.isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("Изключване на устройството...");
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
			System.out.println("Беше добавен текст на " + pageNumber + " страница.");
		} else {
			System.out.println("Не може да се добавя текст. Устройството е спряно.");
		}
	}

	@Override
	void addText(int pageNumber, String text, String password) {
		if (isStarted == true) {
			super.addText(pageNumber, text, password);
			System.out.println("Беше добавен следния текст: \"" + text + " \" - на " + pageNumber + " страница.");
		} else {
			System.out.println("Не може да се добавя текст. Устройството е спряно.");
		}
	}

	@Override
	void addText(int pageNumber, String title, String text, String password) {
		if (isStarted == true) {
			super.addText(pageNumber, title, text, password);
		} else {
			System.out.println("Не може да се добавя текст. Устройството е спряно.");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isStarted == true) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("Не може да се трие текст. Устройството е спряно.");
		}
	}

	@Override
	void deleteText(int pageNumber, String password) {
		if (isStarted == true) {
			super.deleteText(pageNumber, password);
		} else {
			System.out.println("Не може да се трие текст. Устройството е спряно.");
		}
	}

	@Override
	public void overrideText(int pageNumber, String text) {
		if (isStarted == true) {
			super.overrideText(pageNumber, text);
		} else {
			System.out.println("Не може да се коригира текст. Устройството е спряно.");
		}
	}

	@Override
	void overrideText(int pageNumber, String text, String password) {
		if (isStarted == true) {
			super.overrideText(pageNumber, text, password);
		} else {
			System.out.println("Не може да се коригира текст. Устройството е спряно.");
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (isStarted == true) {
			return super.searchWord(word);
		}
		System.out.println("Не може да се търси дума. Устройството е спряно.");
		return false;
	}

	@Override
	boolean searchWord(String word, String password) {
		if (isStarted == true) {
			return super.searchWord(word, password);
		}
		System.out.println("Не може да се търси дума. Устройството е спряно.");
		return false;
	}

	@Override
	public void viewAllPages() {
		if (isStarted == true) {
			super.viewAllPages();
		} else {
			System.out.println("Не може да чете. Устройството е спряно.");
		}
	}

	@Override
	void viewAllPages(String password) {
		if (isStarted == true) {
			super.viewAllPages(password);
		} else {
			System.out.println("Не може да чете. Устройството е спряно.");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted == true) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("Не може да чете. Устройството е спряно.");
		}
	}

	@Override
	void printAllPagesWithDigits(String password) {
		if (isStarted == true) {
			super.printAllPagesWithDigits(password);
		} else {
			System.out.println("Не може да чете. Устройството е спряно.");
		}
	}
}


public class SecuredNotepad extends Notepad implements INotepad {
	private static final int MAXIMUM_PASSWORD_LENGTH = 16;
	private static final int MINIMUM_PASSWORD_LENGTH = 4;
	private String password;
	private boolean isCorrect;

	SecuredNotepad(String password) {
		this.pages = new Page[PAGES_COUNT];
		setPassword(password);
		if (isCorrect == true) {
			System.out.println("�������� � ������� �������� � " + PAGES_COUNT + " ��������.");
		} else {
			this.pages = null;
			System.err.println("�� ���� �� ���� �������� ��������. �������� �������� �� �������� �� ������������ \n 5-15 �������, ����� �����, ������ ����� � �����");
			
		}
	}

	@Override
	public void addText(int pageNumber, String text) {
		System.err.println("�� �� �������� ����� �� " + pageNumber + " ��������, �������� ������� ������!");
	}

	void addText(int pageNumber, String text, String password) {
		if (password.equals(this.password)) {
			if (pageNumber < 1) {
				pageNumber = 1;
			} else {
				if (pageNumber > 20) {
					pageNumber = 20;
				}
			}
			pageNumber -= 1;
			if (pages[pageNumber] == null) {
				pages[pageNumber] = new Page();
			}
			if (pageNumber >= EMPTY_STRING && pageNumber <= PAGES_COUNT && text != null
					&& text.trim().length() > EMPTY_STRING) {
				pages[pageNumber].addText(" " + text);
			}
		} else {
			addText(pageNumber, text);
		}
	}

	void addText(int pageNumber, String title, String text, String password) {
		if (password.equals(this.password)) {
			if (pageNumber < 1) {
				pageNumber = 1;
			} else {
				if (pageNumber > 20) {
					pageNumber = 20;
				}
			}
			this.addText(pageNumber, text, password);
			System.out.println("���� ������� ������� �����: \"" + text + " \" - �� " + pageNumber + " ��������.");
			pageNumber -= 1;
			if (pages[pageNumber] != null && title != null && title.trim().length() > EMPTY_STRING) {
				pages[pageNumber].changeTitle(title);
			}
		} else {
			addText(pageNumber, text);
		}
	}

	@Override
	public void overrideText(int pageNumber, String text) {
		System.err.println("�� �� ���������� ������ �� " + pageNumber + " ��������, �������� ������� ������!");

	}

	void overrideText(int pageNumber, String text, String password) {
		if (password.equals(this.password)) {
			pageNumber -= 1;
			if (pages[pageNumber] != null && pageNumber >= FIRST_PAGE && text != null
					&& text.trim().length() > EMPTY_STRING) {
				pages[pageNumber].deleteText();
				pages[pageNumber].addText(text);
				;
			} else {
				overrideText(pageNumber, text);
			}
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		System.err.println("�� �� �������� ������ �� " + pageNumber + " ��������, �������� ������� ������");
	}

	void deleteText(int pageNumber, String password) {
		if (password.equals(this.password)) {
			pageNumber -= 1;
			if (pages[pageNumber] != null && pageNumber >= FIRST_PAGE && pageNumber <= PAGES_COUNT) {
				pages[pageNumber].deleteText();
			}
		} else {
			deleteText(pageNumber);
		}
	}

	@Override
	public void viewAllPages() {
		System.out.println("�������� ������� ������ �� �� ������ ���������� �� ��������� ��������!");
	}

	void viewAllPages(String password) {
		if (password.equals(this.password)) {
			for (int pageIndex = 0; pageIndex < this.pages.length; pageIndex++) {
				if (pages[pageIndex] != null) {
					Page page = this.pages[pageIndex];
					this.printPage(pageIndex, page, password);
				}
			}
		} else {
			viewAllPages();
		}
	}

	private void printPage(int pageIndex, Page page) {
	}

	private void printPage(int pageIndex, Page page, String password) {
		if (pages[pageIndex] != null) {
			System.out.println("        *Page " + (pageIndex + 1) + "*");
			System.out.println("    <" + pages[pageIndex].viewPage());
			System.out.println();
		} else {
			printPage(pageIndex, page);
		}

	}

	private void setPassword(String password) {
		if (password != null && password.trim().length() > MINIMUM_PASSWORD_LENGTH
				&& password.trim().length() < MAXIMUM_PASSWORD_LENGTH ) {
			int countDigits = 0;
			int countUpperCase = 0;
			int countLowerCase = 0;
			for (int index=0; index<password.length(); index++){
				//�������� ���� ������� �����
				if (password.charAt(index)>='0' && password.charAt(index)<='9'){
					countDigits++;
				}
				//�������� ���� ������� ������ ����� (�������� ��� ��������)
				if ((password.charAt(index)>='A' && password.charAt(index)<='Z') || (password.charAt(index)>='�' && password.charAt(index)<='�')){
					countUpperCase++;
				}
				//�������� ���� ������� ����� ����� (�������� ��� ��������)
				if ((password.charAt(index)>='a' && password.charAt(index)<='z') || (password.charAt(index)>='�' && password.charAt(index)<='�')){
					countLowerCase++;
				}
			}
			if (countDigits>0 && countUpperCase>0 && countLowerCase>0){
			this.password = password;
			isCorrect = true;
			}
		} else {
			isCorrect = false;
			System.out.println("������� �� ����� ������ /5-15 �������/ ����� �����, ������ �����, �����!!!");
		}
	}

	@Override
	public boolean searchWord(String word) {
		System.out.println("���� �������� ������� ������ �� �� ������� ������ " + word + " � ������.");
		return false;
	}

	boolean searchWord(String word, String password) {
		if (password.equals(this.password)) {
			if (word != null && word.trim().length() > 0) {
				for (int pageIndex = FIRST_PAGE; pageIndex < PAGES_COUNT; pageIndex++) {
					if (pages[pageIndex] != null && this.pages[pageIndex].getText().contains(word)) {
						System.out.println("������ \"" + word + "\" � �������� � ���������.");
						return true;
					}
				}
			} else {
				return searchWord(word);
			}
		}
		System.out.println("������ \"" + word + "\" �� � �������� � ���������.");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		System.err.println("�� �� ��������� � ��� �������� ��� ����� ������ �������� ������� ������");
	}

	void printAllPagesWithDigits(String password) {
		if (password.equals(this.password)) {
			System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("||������ ��������, ����� �������� ����� ��:||");
			System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
			for (int pageIndex = FIRST_PAGE; pageIndex < PAGES_COUNT; pageIndex++) {
				if (this.pages[pageIndex] != null) {
					Page page = this.pages[pageIndex];
					if (page.containsDigits()) {
						this.printPage(pageIndex, page, password);
					}
				}
			}
		} else {
			printAllPagesWithDigits();
		}
	}

}

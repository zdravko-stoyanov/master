
public class SecuredNotepad implements INotepad {
	private static final int MAXIMUM_PASSWORD_LENGTH = 16;
	private static final int MINIMUM_PASSWORD_LENGTH = 4;
	private String password;
	private Page[] pages;
	private boolean isCorrect;

	SecuredNotepad(String password) {
		this.pages = new Page[PAGES_COUNT];
		setPassword(password);
		if (isCorrect == true) {
			System.out.println("Създаден е защитен бележник с " + PAGES_COUNT + " страници.");
		} else {
			this.pages = null;
			System.out.println("Не може да бъде създаден бележник");
		}
	}

	@Override
	public void addText(int pageNumber, String text) {
		System.err.println("За да добавите текст на " + pageNumber + " страница, въведете валидна парола!");
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
		System.err.println("За да преправите текста на " + pageNumber + " страница, въведете валидна парола!");

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
		System.err.println("За да изтриете текста на " + pageNumber + " страница, въведете валидна парола");
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
		System.out.println("Въведете валидна парола за да видите страниците на защитения бележник!");
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
				&& password.trim().length() < MAXIMUM_PASSWORD_LENGTH) {
			this.password = password;
			isCorrect = true;
		} else {
			isCorrect = false;
			System.out.println("ПАРОЛАТА ТРЯБВА ДА Е МЕЖДУ /5-15/ СИМВОЛА!!!");
		}
	}

	@Override
	public boolean searchWord(String word) {
		System.out.println("Моля въведете валидна парола за да потърся думата " + word + " в текста.");
		return false;
	}

	boolean searchWord(String word, String password) {
		if (password.equals(this.password)) {
			if (word != null && word.trim().length() > 0) {
				for (int pageIndex = 0; pageIndex < PAGES_COUNT; pageIndex++) {
					if (pages[pageIndex] != null && this.pages[pageIndex].getText().contains(word)) {
						System.out.println("Думата \"" + word + "\" е намерена в бележника.");
						return true;
					}
				}
			} else {
				return searchWord(word);
			}
		}
		System.out.println("Думата \"" + word + "\" НЕ е намерена в бележника.");
		return false;
	}

}

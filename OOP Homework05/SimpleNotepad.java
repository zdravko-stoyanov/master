
public class SimpleNotepad extends Notepad implements INotepad {
	
	SimpleNotepad() {
		this.pages = new Page[PAGES_COUNT];
		System.out.println("Създаден е бележник с " + PAGES_COUNT + " страници.");
	}

	@Override
	public void addText(int pageNumber, String text) {
		if (pageNumber < 1) {
			pageNumber = 1;
		} else {
			if (pageNumber > 20) {
				pageNumber = 20;
			}
		}
		// pageNumber-=1 za da moje da se dobavqt stranici ot 1 do 20, a ne ot 0
		// do 19
		pageNumber -= 1;
		if (pages[pageNumber] == null) {
			pages[pageNumber] = new Page();
		}
		if (pageNumber >= EMPTY_STRING && pageNumber <= PAGES_COUNT && text != null
				&& text.trim().length() > EMPTY_STRING) {
			pages[pageNumber].addText(" " + text);
			System.out.println("Беше добавен следния текст: \"" + text + " \" - на " + (pageNumber+1) + " страница.");
		}
	}

	void addText(int pageNumber, String title, String text) {
		if (pageNumber < 1) {
			pageNumber = 1;
		} else {
			if (pageNumber > 20) {
				pageNumber = 20;
			}
		}
		this.addText(pageNumber, text);
		pageNumber -= 1;
		if (title != null && title.trim().length() > EMPTY_STRING) {
			pages[pageNumber].changeTitle(title);
		}

	}

	@Override
	public void overrideText(int pageNumber, String text) {
		pageNumber -= 1;
		if (pageNumber >= FIRST_PAGE && text != null && text.trim().length() > EMPTY_STRING) {
			pages[pageNumber].deleteText();
			pages[pageNumber].addText(text);
			;
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		pageNumber -= 1;
		if (pageNumber >= FIRST_PAGE && pageNumber <= PAGES_COUNT) {
			pages[pageNumber].deleteText();
		}
	}

	public boolean searchWord(String word) {
		if (word != null && word.trim().length() > EMPTY_STRING) {
			for (Page page : this.pages) {
				if (page != null && page.searchWord(word)) {
					System.out.println("Думата \"" + word + "\" я има в текста ");
					return true;
				}
			}
		}
		System.out.println("Думата \"" + word + "\" я няма в текста ");
		return false;
	}

	public void printAllPagesWithDigits() {
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||Всички страници, които съдържат цифри са:||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
		for (int pageIndex = FIRST_PAGE; pageIndex < PAGES_COUNT; pageIndex++) {
			if (this.pages[pageIndex] != null) {
				Page page = this.pages[pageIndex];
				if (page.containsDigits()) {
					this.printPage(pageIndex, page);
				}
			}
		}
	}

	@Override
	public void viewAllPages() {
		for (int pageIndex = 0; pageIndex < this.pages.length; pageIndex++) {
			Page page = this.pages[pageIndex];
			this.printPage(pageIndex, page);
		}
	}

	private void printPage(int pageIndex, Page page) {
		if (pages[pageIndex] != null) {
			System.out.println("        *Page " + (pageIndex + 1) + "*");
			System.out.println("    <" + pages[pageIndex].viewPage());
			System.out.println();
		}

	}
}

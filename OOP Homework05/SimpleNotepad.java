
public class SimpleNotepad implements INotepad {

	private static final int FIRST_PAGE = 0;
	private static final int EMPTY_STRING = 0;
	private static final int PAGES_COUNT = 20;
	private Page[] pages;

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
		pages[pageNumber] = new Page();
		if (pageNumber >= EMPTY_STRING && pageNumber <= PAGES_COUNT && text != null
				&& text.trim().length() > EMPTY_STRING) {
			pages[pageNumber].addText(text);
		}
	}

	public void addText(int pageNumber, String title, String text) {
		this.addText(pageNumber, text);
		pageNumber-=1;
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
				if (page.searchWord(word)) {
					return true;
				}
			}
		}
		return false;
	}

	public void printAllPagesWithDigits() {
		System.out.println("Всички страници, които съдържат цифри са:");
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
			System.out.println("        *Page " + (pageIndex + 1) + pageIndex);
			System.out.println("    <" + pages[pageIndex].viewPage());
			System.out.println(Page.NEW_LINE);
		}

	}
}

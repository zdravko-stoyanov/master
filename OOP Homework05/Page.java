
class Page {
	private static final int MAX_TITLE_LENGTH = 20;
	private static final char LAST_DIGIT = '9';
	private static final char FIRST_DIGIT = '0';
	static final String NEW_LINE = "\n";
	private String title;
	private String text;

	Page() {
		this.title = "";
		this.text = "";
	}

	Page(String title, String text) {
		setText(text);
		setTitle(title);
	}

	void changeTitle(String title) {
		if (title != null && title.trim().length() > 0 && title.trim().length() <= MAX_TITLE_LENGTH) {
			this.title = title;
		} else {
			this.title = "No title";
		}
	}

	void addText(String text) {
		if (text != null && text.trim().length() > 0) {
			setText(this.text += text);
		} else {
			setText(text);
		}
	}

	void deleteText() {
		this.text = "";
	}

	String viewPage() {
		if (this.title.trim().length() > 0 && this.title.trim().length() <= MAX_TITLE_LENGTH) {
			String page = this.title + ">" + NEW_LINE + "----------------------------" + NEW_LINE + this.text;
			return page;
		}
		this.title = "";
		this.text = "";
		String page = this.title + "[Blank  tittle]>" + NEW_LINE + "----------------------------" + this.text;
		return page;
	}

		boolean searchWord(String word) {
			return (this.text.contains(word));
		}

		boolean containsDigits() {
		String text = this.title + " " + this.text;
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) >= FIRST_DIGIT && text.charAt(index) <= LAST_DIGIT) {
				return true;
			}
		}
		return false;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		if (title != null && title.trim().length() > 0) {
			this.title = title;
		}
	}

	String getText() {
		return text;
	}

	void setText(String text) {
		if (text != null && text.trim().length() > 0) {
			this.text = text;
		}
	}
}
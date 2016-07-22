
class Page {
	private static final int MAX_TITLE_LENGTH = 20;
	private static final char LAST_DIGIT = '9';
	private static final char FIRST_DIGIT = '0';
	public static final String NEW_LINE = "\n";
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

	public void changeTitle(String title) {
		if (title != null && title.trim().length() > 0 && title.trim().length() <= MAX_TITLE_LENGTH) {
			this.title = title;
		} else {
			this.title = "No title";
		}
	}

	public void addText(String text) {
		if (text != null && text.trim().length() > 0) {
			setText(this.text += text);
		} else {
			setText(text);
		}
	}

	public void deleteText() {
		this.text = "";
	}

	String viewPage() {
		if (this.title != null && this.title.trim().length() > 0 && this.title.trim().length() <= MAX_TITLE_LENGTH
				&& this.text != null) {
			String page = this.title + ">" + NEW_LINE + "----------------------------" + NEW_LINE + this.text;
			return page;
		}
		this.title = "";
		this.text = "";
		String page = this.title + "[Blank  tittle]>" + NEW_LINE + "----------------------------" + this.text;
		return page;
	}

	public boolean searchWord(String word) {
		if (word != null && word.trim().length() > 0) {
			String text = this.title + " " + this.text;
			String[] words = text.split(" ");
			for (int index = 0; index < text.length(); index++) {
				if (word.equalsIgnoreCase(words[index])) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean containsDigits() {
		String text = this.title + " " + this.text;
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) >= FIRST_DIGIT && text.charAt(index) <= LAST_DIGIT) {
				return true;
			}
		}
		return false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null && title.trim().length() > 0) {
			this.title = title;
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text != null && text.trim().length() > 0) {
			this.text = text;
		}
	}
}
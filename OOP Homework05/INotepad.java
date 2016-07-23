
public interface INotepad {
	public static final int FIRST_PAGE = 0;
	public static final int EMPTY_STRING = 0;
	public static final int PAGES_COUNT = 20;
	
	void addText(int pageNumber, String text);
	void overrideText (int pageNumber, String text);
	void deleteText(int pageNumber);
	void viewAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}

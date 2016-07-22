
public interface INotepad {
	void addText(int pageNumber, String text);
	void overrideText (int pageNumber, String text);
	void deleteText(int pageNumber);
	void viewAllPages();
}

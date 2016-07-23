
public class DemoElectronicSecuredDevice {
	public static void main(String[] args) {
		ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad("parola");
		electronicNotepad.start();
		electronicNotepad.addText(1, "Първа страница"," Някакъв текст","parola");
		electronicNotepad.stop();
		electronicNotepad.addText(35325424, "Последна страница"," Въведеох невалидна страница за да намеря последната.","parola");
		electronicNotepad.deleteText(1, "parola");
		electronicNotepad.printAllPagesWithDigits("parola");
		electronicNotepad.overrideText(1, "преработка", "parola");
		electronicNotepad.searchWord("Квазимодо", "parola");
		electronicNotepad.viewAllPages("parola");
		electronicNotepad.start();
		electronicNotepad.addText(35325424, "Последна страница"," Въведеох невалидна страница за да намеря последната.","parola");
		electronicNotepad.deleteText(1, "parola");
		electronicNotepad.printAllPagesWithDigits("parola");
		electronicNotepad.overrideText(1, "преработка", "parola");
		electronicNotepad.searchWord("Квазимодо", "parola");
		electronicNotepad.viewAllPages("parola");

	}

}

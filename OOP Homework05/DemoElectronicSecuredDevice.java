
public class DemoElectronicSecuredDevice {
	public static void main(String[] args) {
		ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad("parola");
		electronicNotepad.start();
		electronicNotepad.addText(1, "����� ��������"," ������� �����","parola");
		electronicNotepad.stop();
		electronicNotepad.addText(35325424, "�������� ��������"," �������� ��������� �������� �� �� ������ ����������.","parola");
		electronicNotepad.deleteText(1, "parola");
		electronicNotepad.printAllPagesWithDigits("parola");
		electronicNotepad.overrideText(1, "����������", "parola");
		electronicNotepad.searchWord("���������", "parola");
		electronicNotepad.viewAllPages("parola");
		electronicNotepad.start();
		electronicNotepad.addText(35325424, "�������� ��������"," �������� ��������� �������� �� �� ������ ����������.","parola");
		electronicNotepad.deleteText(1, "parola");
		electronicNotepad.printAllPagesWithDigits("parola");
		electronicNotepad.overrideText(1, "����������", "parola");
		electronicNotepad.searchWord("���������", "parola");
		electronicNotepad.viewAllPages("parola");

	}

}


public class Demo {
	public static void main(String[] args) {
		SimpleNotepad belejnik = new SimpleNotepad();
		belejnik.addText(1, "���� �� ���� ��������");
		belejnik.deleteText(1);
		belejnik.addText(1, "������� ��������", "�� ���� ����� �������� �� ������� ������� ���������� �� �������.");
		belejnik.addText(1, "\n ������: (0_>0)\n ���: ����\n �������: �����\n �������: �����\n ���: 9007206446\n ������ �� ���������: @");
		belejnik.addText(2, "��������",
				"��� �� �� ����� ����������");
		belejnik.addText(3, "������",
				"�����������: 5, 4, 6\n ������������� �������: 6, 5, 5\n �������� ��������: 4, 5, 6\n ������������: 6, 6, 6\n ����������� �� PC: 3, 4, 3");
		belejnik.overrideText(2, "�����������\n ������������� �������\n �������� ��������\n ������������\n ����������� �� PC");
		belejnik.viewAllPages();
		belejnik.searchWord("����");
		belejnik.searchWord("����");
		belejnik.printAllPagesWithDigits();



	}
}
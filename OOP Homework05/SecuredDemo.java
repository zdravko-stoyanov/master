
public class SecuredDemo {

	public static void main(String[] args) {
		SecuredNotepad securedBelejnik = new SecuredNotepad("parola");
		securedBelejnik.addText(1, "�����", "parola");
		securedBelejnik.addText(-300, "������� ��������", "������� �������� �� ��������� ��������", "parola");
		securedBelejnik.addText(10, "����� ����", "10 �������� �� ��������� ��������", "greshnaParola");
		securedBelejnik.addText(10, "����� ������", "10 �������� �� ��������� �������� - ����� ����", "parola");
		securedBelejnik.addText(300, "����� ����", "���������� �������� �� ��������� ��������", "parola");
		securedBelejnik.overrideText(1, "���������� �����");
		securedBelejnik.overrideText(1, "���������� ����� - ����� ����", "parola");
		securedBelejnik.deleteText(10);
		securedBelejnik.deleteText(10, "parola");
		securedBelejnik.overrideText(10, "10 �������� - ����� ����", "parola");
		securedBelejnik.viewAllPages("parola");
		securedBelejnik.searchWord("��������", "parola");
		
		

	}

}

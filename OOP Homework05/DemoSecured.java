
public class DemoSecured {

	public static void main(String[] args) {
		SecuredNotepad securedBelejnik = new SecuredNotepad("parola3D");
		securedBelejnik.addText(-300, "������� ��������", "������� �������� �� ��������� ��������", "parola3D");
		securedBelejnik.addText(10, "����� ����", "10 �������� �� ��������� ��������", "greshnaParola");
		securedBelejnik.addText(10, "����� ������", "10 �������� �� ��������� �������� - ����� ����", "parola3D");
		securedBelejnik.addText(300, "����� ����", "���������� �������� �� ��������� ��������", "parola3D");
		securedBelejnik.overrideText(1, "���������� �����");
		securedBelejnik.overrideText(1, "���������� ����� - ����� ����", "parola3D");
		securedBelejnik.deleteText(10);
		securedBelejnik.deleteText(10, "parola3D");
		securedBelejnik.overrideText(10, "10 �������� - ����� ����", "parola3D");
		securedBelejnik.viewAllPages("parola3D");
		securedBelejnik.searchWord("����", "parola3D");
		securedBelejnik.printAllPagesWithDigits();
		securedBelejnik.printAllPagesWithDigits("parola3D");
		
		

	}

}

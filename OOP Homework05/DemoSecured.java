
public class DemoSecured {

	public static void main(String[] args) {
		SecuredNotepad securedBelejnik = new SecuredNotepad("parola3D");
		securedBelejnik.addText(-300, "Начална Страница", "Първата страница на защитения бележник", "parola3D");
		securedBelejnik.addText(10, "Лични неща", "10 страница на защитения бележник", "greshnaParola");
		securedBelejnik.addText(10, "Други работи", "10 страница на защитения бележник - Втори опит", "parola3D");
		securedBelejnik.addText(300, "Лични неща", "Последната страница на защитения бележник", "parola3D");
		securedBelejnik.overrideText(1, "Преработен текст");
		securedBelejnik.overrideText(1, "Преработен текст - Втори опит", "parola3D");
		securedBelejnik.deleteText(10);
		securedBelejnik.deleteText(10, "parola3D");
		securedBelejnik.overrideText(10, "10 страница - трети опит", "parola3D");
		securedBelejnik.viewAllPages("parola3D");
		securedBelejnik.searchWord("опит", "parola3D");
		securedBelejnik.printAllPagesWithDigits();
		securedBelejnik.printAllPagesWithDigits("parola3D");
		
		

	}

}

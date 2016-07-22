
public class SecuredDemo {

	public static void main(String[] args) {
		SecuredNotepad securedBelejnik = new SecuredNotepad("parola");
		securedBelejnik.addText(1, "Текст", "parola");
		securedBelejnik.addText(-300, "Начална Страница", "Първата страница на защитения бележник", "parola");
		securedBelejnik.addText(10, "Лични неща", "10 страница на защитения бележник", "greshnaParola");
		securedBelejnik.addText(10, "Други работи", "10 страница на защитения бележник - Втори опит", "parola");
		securedBelejnik.addText(300, "Лични неща", "Последната страница на защитения бележник", "parola");
		securedBelejnik.overrideText(1, "Преработен текст");
		securedBelejnik.overrideText(1, "Преработен текст - Втори опит", "parola");
		securedBelejnik.deleteText(10);
		securedBelejnik.deleteText(10, "parola");
		securedBelejnik.overrideText(10, "10 страница - трети опит", "parola");
		securedBelejnik.viewAllPages("parola");
		securedBelejnik.searchWord("бележник", "parola");
		
		

	}

}

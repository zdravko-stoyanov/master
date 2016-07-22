
public class Demo {
	public static void main(String[] args) {
		SimpleNotepad belejnik = new SimpleNotepad();
		belejnik.addText(1, "Имам си нова страница");
		belejnik.deleteText(1);
		belejnik.addText(1, "Начална страница", "На тази първа страница се съдържа основна информация за ученика.");
		belejnik.addText(1, "\n Снимка: (0_>0)\n Име: Гошо\n Презиме: Тутов\n Фамилия: Коцев\n ЕГН: 9007206446\n Подпис на директора: @");
		belejnik.addText(2, "Предмети",
				"Още не се знаят предметите");
		belejnik.addText(3, "Оценки",
				"Информатика: 5, 4, 6\n Информационни системи: 6, 5, 5\n Приложен Софтуеър: 4, 5, 6\n Програмиране: 6, 6, 6\n Асемблиране на PC: 3, 4, 3");
		belejnik.overrideText(2, "Информатика\n Информационни системи\n Приложен Софтуеър\n Програмиране\n Асемблиране на PC");
		belejnik.viewAllPages();
		belejnik.searchWord("Гошо");
		belejnik.searchWord("Пешо");
		belejnik.printAllPagesWithDigits();



	}
}
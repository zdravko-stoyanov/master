package Restaurant;

import java.util.ArrayList;
import java.util.List;

import Exceptions.IcorrectNameException;

class Menu {
	private static final int NUMBER_OF_FOODS = 10;
	private static final int NUMBER_OF_DRINKS = 20;
	private List<Food> foods = new ArrayList<>();
	private List<Drink> drinks = new ArrayList<>();
	private String[] salads = { "Шопска", "Овчарска", "IT-талантска" };
	private String[] mainFoods = { "Глиган на скара", "Петел по шопскки", "Мешана скара" };
	private String[] desert = { "Торта", "Палачинки", "Суфле" };
	private String[] alcoholDrink = { "Водка", "Уиски", "Бира" };
	private String[] softDrink = { "Кола", "Фанта", "Спрайт" };

	public Menu() throws IcorrectNameException {
		for (int index = 0; index < NUMBER_OF_FOODS; index++) {
			foods.add(new Salad(salads[((int) Math.random() * 3)]));
			foods.add(new MainFood(mainFoods[((int) Math.random() * 3)]));
			foods.add(new Desert(desert[((int) Math.random() * 3)]));
		}
		for (int index = 0; index < NUMBER_OF_DRINKS; index++) {
			drinks.add(new AlcoholDrink(alcoholDrink[((int) Math.random() * 3)]));
			drinks.add(new SoftDrink(softDrink[((int) Math.random() * 3)]));
		}
	}
}

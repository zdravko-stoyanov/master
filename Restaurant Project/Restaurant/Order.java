package Restaurant;

import java.util.ArrayList;
import java.util.List;

class Order {
	List<Food> foods = new ArrayList<>();
	List<Drink> drinks = new ArrayList<>();

	Order(Food food, Drink drink) {
		this.foods.add(food);
		this.drinks.add(drink);
	}

}

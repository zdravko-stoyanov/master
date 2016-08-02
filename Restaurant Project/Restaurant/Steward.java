package Restaurant;

import java.util.ArrayList;
import java.util.List;

import Exceptions.IcorrectNameException;
import Exceptions.IncorrectOrderException;

class Steward extends NameInfo {

	private static final double PERCENTAGE_OF_THE_CHECK = 0.2;
	int perks;
	List<Order> orders = new ArrayList<Order>();

	Steward(String name) throws IcorrectNameException {
		super(name);
	}

	void takeOrder(Order order) throws IncorrectOrderException {
		if (order != null) {
			this.orders.add(order);
		} else {
			throw new IncorrectOrderException("There is no order");
		}
	}

	float sumPerks() {
		float perks = 0;
		for (int index = 0; index < orders.size(); index++) {
			double drinks = this.orders.get(index).drinks.get(0).price;
			double foods = this.orders.get(index).foods.get(0).price;
			perks += ((drinks + foods) * PERCENTAGE_OF_THE_CHECK);
		}
		return perks;
	}

}

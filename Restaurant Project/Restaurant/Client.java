package Restaurant;

import java.util.ArrayList;
import java.util.List;

import Exceptions.IcorrectNameException;
import Exceptions.NoMoneyException;

abstract class Client extends NameInfo implements Eatable, Drinkable {
	private static final double PERKS_COEFICIENT = 1.2;
	private double money;
	protected List<Order> orders = new ArrayList<Order>();

	Client(String name) throws IcorrectNameException {
		super(name);
	}

	@Override
	public int eat() {
		if (this.orders.size() > 0) {
			for (int index = 0; index < this.orders.size(); index++) {
				int sum = 0;
				if (this.orders.get(index).foods != null) {
					sum += this.orders.get(index).foods.get(index).price;
					return sum;
				}
			}
		}
		return 0;
	}

	@Override
	public int drink() {
		if (this.orders.size() > 0) {
			for (int index = 0; index < this.orders.size(); index++) {
				int sum = 0;
				if (this.orders.get(index).drinks != null) {
					sum += this.orders.get(index).drinks.get(index).price;
					return sum;
				}
			}
		}
		return 0;
	}

	double askCheck() {
		if (this.orders != null) {
			int check = eat() + drink();
			double perks = check * PERKS_COEFICIENT;
			return perks;
		}
		return 0;
	}

	void payCheck() throws NoMoneyException {
		if (this.getMoney() >= askCheck()) {
			setMoney(this.getMoney() - askCheck());
		} else {
			throw new NoMoneyException(
					"You don't have enought money. \nNow you should wash dishes till the end of your life!");
		}
	}

	protected double getMoney() {
		return money;
	}

	protected void setMoney(double money) throws NoMoneyException {
		if (money > 0) {
			this.money = money;
		} else {
			throw new NoMoneyException("Invalid money");
		}
	}
}

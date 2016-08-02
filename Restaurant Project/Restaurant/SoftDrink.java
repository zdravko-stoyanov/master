package Restaurant;

import Exceptions.IcorrectNameException;

class SoftDrink extends Drink{

	SoftDrink(String name) throws IcorrectNameException {
		super(name);
		this.price = 2;
	}

}

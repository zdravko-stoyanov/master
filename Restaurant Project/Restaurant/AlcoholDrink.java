package Restaurant;

import Exceptions.IcorrectNameException;

class AlcoholDrink extends Drink{

	AlcoholDrink(String name) throws IcorrectNameException {
		super(name);
		this.price = 4;
	}

}

package Restaurant;

import Exceptions.IcorrectNameException;

class Salad extends Food {

	Salad(String name) throws IcorrectNameException {
		super(name);
		this.price = 5;
		this.weight = ((((int) Math.random() * 301) + 300));
	}

}

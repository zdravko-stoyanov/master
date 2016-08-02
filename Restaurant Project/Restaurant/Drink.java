package Restaurant;

import Exceptions.IcorrectNameException;

abstract class Drink extends Product{

	Drink(String name) throws IcorrectNameException {
		super(name);
	}

}

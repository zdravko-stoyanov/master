package Restaurant;

import Exceptions.IcorrectNameException;

abstract class Food extends Product {

	int weight;

	Food(String name) throws IcorrectNameException {
		super(name);

	}

}

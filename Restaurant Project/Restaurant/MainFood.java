package Restaurant;

import Exceptions.IcorrectNameException;

class MainFood extends Food {

	MainFood(String name) throws IcorrectNameException {
		super(name);
		this.price = 9;
		this.weight = ((((int) Math.random() * 401) + 400));
	}

}

package Restaurant;

import Exceptions.IcorrectNameException;

class Desert extends Food {
	Desert(String name) throws IcorrectNameException {
		super(name);
		this.price = 4;
		this.weight = ((((int) Math.random() * 101) + 200));
	}

}

package Restaurant;

import Exceptions.IcorrectNameException;
import Exceptions.NoMoneyException;

class Gangster extends Client {

	Gangster(String name) throws IcorrectNameException, NoMoneyException {
		super(name);
		this.setMoney(50);
	}
}

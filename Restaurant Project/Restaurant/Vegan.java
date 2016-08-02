package Restaurant;

import Exceptions.IcorrectNameException;
import Exceptions.IncorrectOrderException;
import Exceptions.NoMoneyException;

class Vegan extends Client {

	Vegan(String name) throws IcorrectNameException, NoMoneyException {
		super(name);
		this.setMoney(30);
	}
}

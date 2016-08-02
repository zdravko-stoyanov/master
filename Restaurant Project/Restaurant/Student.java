package Restaurant;

import java.util.ArrayList;
import java.util.List;

import Exceptions.IcorrectNameException;
import Exceptions.IncorrectOrderException;
import Exceptions.NoMoneyException;

class Student extends Client {
	

	Student(String name) throws IcorrectNameException, NoMoneyException {
		super(name);
		this.setMoney(10);
	}
}

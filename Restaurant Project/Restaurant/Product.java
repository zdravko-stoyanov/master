package Restaurant;

import Exceptions.IcorrectNameException;

abstract class Product extends NameInfo {

	int price;

	Product(String name) throws IcorrectNameException {
		super(name);
	}


}

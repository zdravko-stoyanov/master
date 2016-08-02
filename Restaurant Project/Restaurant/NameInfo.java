package Restaurant;

import Exceptions.IcorrectNameException;

abstract class NameInfo {
	protected String name;

	NameInfo(String name) throws IcorrectNameException {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		} else {
			throw new IcorrectNameException("Invalid name");
		}
	}

	public String getName() {
		return name;
	}

}

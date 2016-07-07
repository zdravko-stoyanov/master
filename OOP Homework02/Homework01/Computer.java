package Homework01;

public class Computer {
	private static final double MIN_HDD_MEMORY = 0.01;
	private static final int CHEAPEST_PC_IN_SHOP = 300;
	private static final int YEAR_FOR_MODERN_PC = 2000;
	String brand;
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		if (year < YEAR_FOR_MODERN_PC) {
			this.year = YEAR_FOR_MODERN_PC;
		} else {
			this.year = year;
		}
		if (price < CHEAPEST_PC_IN_SHOP) {
			this.price = CHEAPEST_PC_IN_SHOP;
			System.out.println("Най-евтиния компютър, който се продава е 300 лева. ;)");
		} else {
			this.price = price;
		}
		if (hardDiskMemory < 0) {
			this.hardDiskMemory = MIN_HDD_MEMORY;
			System.out.println("Invalid HDD memory.");
		} else {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory <= 0) {
			System.out.println("Not enough free memory");
		} else {
			this.freeMemory = freeMemory;
		}
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
	}

	int comparePrice(Computer PC) {
		if (this.price > PC.price) {
			return -1;
		} else {
			if (this.price < PC.price) {
				return 1;
			}
			return 0;
		}
	}

}

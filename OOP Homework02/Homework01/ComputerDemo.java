package Homework01;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer firstPC = new Computer(2013, 658, 512, 200);
		Computer secondPC = new Computer(2011, 545.89, 512, 180);
		Computer thirdPC = new Computer(2016, 1399.89, true, 1024, 860, "Windows 10");
		System.out.println("First PC costs: " + firstPC.price + " BGN Second PC costs: " + secondPC.price
				+ " BGN, \nso third PC costs: " + thirdPC.price + " BGN.");
		if (secondPC.comparePrice(thirdPC) == 1) {
			System.out.println("Third is more expensive then second!");
		} else {
			if (secondPC.comparePrice(thirdPC) == -1) {
				System.out.println("Second is more expensive then third!");
			} else {
				System.out.println("Second and third are at same price!");
			}
		}
		if (firstPC.comparePrice(secondPC) == -1) {
			System.out.println("First is more expensive then second!");
		} else {
			if (firstPC.comparePrice(secondPC) == 1) {
				System.out.println("Second is more expensive then first!");
			} else {
				System.out.println("First and second are at same price!");
			}
		}

	}

}

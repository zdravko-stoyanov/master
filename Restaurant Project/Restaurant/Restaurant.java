package Restaurant;

import java.util.ArrayList;
import java.util.List;

import Exceptions.ClientException;
import Exceptions.IcorrectNameException;

class Restaurant {

	private static final double PERKS_OF_THE_STEWARDS = 0.2;
	private static final int NUMBER_OF_STEWARDS = 5;
	private static final int STARTING_RESTAURANT_BALANCE = 1000;
	private String name;
	private String address;
	private int balance;
	private Menu menu;
	private List<Steward> stewards = new ArrayList<>();
	private List<Client> clients = new ArrayList<>();

	Restaurant() throws IcorrectNameException {
		// Не правя проверки, защото не могат да се въведат невалидни данни от
		// демото.
		this.name = "При Пешо Таланта";
		this.balance = STARTING_RESTAURANT_BALANCE;
		this.menu = new Menu();
		this.address = "София, бул. Дондуков 13";
		// Автоматично като се създаде ресторант, той си създава 5-ма сервитьори
		addStewards();
	}

	List<Client> getClients() {
		return clients;
	}

	void addClients(Client client) throws ClientException {
		if (client != null) {
			clients.add(client);
		} else {
			throw new ClientException("There is no client to add");
		}
	}

	private void addStewards() throws IcorrectNameException {
		String[] stewardNames = { "Люмиер", "Антоан", "Максимилиян", "Грегъри", "Жибер", "Херакъл", "Пресиян",
				"Зинедин", "Прокопи", "Стивън", "Корнелио", "Вебер" };
		for (int index = 0; index < NUMBER_OF_STEWARDS; index++) {
			this.stewards.add(new Steward(stewardNames[(int) (Math.random() * 10)]));
		}

	}

	float sumEarnedMoney() {
		float earnedMoney = 0;
		for (int index = 0; index < stewards.size(); index++) {
			earnedMoney += this.stewards.get(index).sumPerks() / PERKS_OF_THE_STEWARDS;
		}
		this.balance += earnedMoney;
		return earnedMoney;
	}
	
	void removeProducts(){
	
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getBalance() {
		return balance;
	}

	public Menu getMenu() {
		return menu;
	}

	List<Steward> getStewards() {
		return stewards;
	}

}

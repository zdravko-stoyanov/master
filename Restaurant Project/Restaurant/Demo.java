package Restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Exceptions.ClientException;
import Exceptions.IcorrectNameException;
import Exceptions.IncorrectOrderException;
import Exceptions.NoMoneyException;

public class Demo {

	private static final int NUMBER_OF_CLIENTS = 15;
	private static final float PERKS_COEFICIENT = 0.2F;
	private static String[] salads = { "Шопска", "Овчарска", "IT-талантска" };
	private static String[] mainFoods = { "Глиган на скара", "Петел по шопски", "Мешана скара" };
	private static String[] deserts = { "Торта", "Палачинки", "Суфле" };
	private static String[] alcoholDrink = { "Водка", "Уиски", "Бира" };
	private static String[] softDrink = { "Кола", "Фанта", "Спрайт" };

	static void startWork(Restaurant restaurant, ArrayList<Client> clients, ArrayList<Steward> stewards)
			throws ClientException, IncorrectOrderException, IcorrectNameException, NoMoneyException {
		System.out.println("Ресторант " + restaurant.getName() + " започна работа.");
		for (int index = 0; index < NUMBER_OF_CLIENTS; index++) {
			restaurant.addClients((Client) clients.get(index));
			if (clients.get(index) instanceof Student) {
				Order studentsOrder = new Order((new Desert(deserts[(int) (Math.random() * 3)])),
						(new AlcoholDrink(alcoholDrink[(int) (Math.random() * 3)])));
				((Student) clients.get(index)).orders.add(studentsOrder);
				stewards.get((int) (Math.random() * 5)).takeOrder(studentsOrder);
			} else {
				if (clients.get(index) instanceof Gangster) {
					Order gangstersOrder = new Order((new MainFood(mainFoods[(int) (Math.random() * 3)])),
							new AlcoholDrink(alcoholDrink[(int) (Math.random() * 3)]));
					((Gangster) clients.get(index)).orders.add(gangstersOrder);
					stewards.get((int) (Math.random() * 5)).takeOrder(gangstersOrder);
				} else {
					if (clients.get(index) instanceof Vegan) {
						Order vegansOrder = new Order(new Salad(salads[(int) (Math.random() * 3)]),
								new SoftDrink(softDrink[(int) (Math.random() * 3)]));
						((Vegan) clients.get(index)).orders.add(vegansOrder);
						stewards.get((int) (Math.random() * 5)).takeOrder(vegansOrder);
					}
				}
			}
			int check = clients.get(index).orders.get(0).foods.get(0).price
					+ clients.get(index).orders.get(0).drinks.get(0).price;
			String food = clients.get(index).orders.get(0).foods.get(0).name;
			String drink = clients.get(index).orders.get(0).drinks.get(0).name;
			String client = clients.get(index).name;
			System.out.print(client + " си поръча " + food + " и " + drink + " за сумата от " + check
					+ "лв + 20% бакшиш: " + (check * PERKS_COEFICIENT) + "лв.\n");
			clients.get(index).askCheck();
			clients.get(index).payCheck();
		}
		System.out.println("Заведението затвори, клиентите си тръгнаха.");
		System.out.println("Сервитьорите са взели следните бакшиши: ");

		for (int index = 0; index < stewards.size(); index++) {
			System.out.print(stewards.get(index).getName() + " - " + stewards.get(index).sumPerks() + "лв. ");
		}
		double max = 0;
		int maxIndex = 0;
		for (int a = 0; a < stewards.size(); a++) {
			for (int index = 0; index < stewards.size(); index++) {
				if (stewards.get(index).sumPerks() > max) {
					max = stewards.get(index).sumPerks();
					maxIndex = index;
				}
			}
		}
		System.out.println();
		System.out.println(stewards.get(maxIndex).name + " е изкарал най-висок бакшиш: " + max + "лв.");
		System.out.print("За този работен ден, ресторанта е изкарал " + restaurant.sumEarnedMoney() + "лв.");
	}

	public static void main(String[] args) {
		try {
			String[] names = { "Гошо", "Пешо", "Рашо", "Дима", "Ники", "Цецо", "Таня", "Вероника", "Краси", "Спас" };
			Restaurant restaurant = new Restaurant();
			List<Client> clients = new ArrayList<>();
			for (int index = 0; index < NUMBER_OF_CLIENTS; index++) {
				double randomClient = Math.random();
				if (randomClient <= 0.2) {
					clients.add(new Vegan(names[(int) (Math.random() * 10)]));
				} else {
					if (randomClient > 0.2 && randomClient <= 0.5) {
						clients.add(new Student(names[(int) (Math.random() * 10)]));
					} else {
						clients.add(new Gangster(names[(int) (Math.random() * 10)]));
					}
				}
			}
			System.out.println(restaurant.getName() + " има стартов капитал: " + restaurant.getBalance() + "лв.");
			System.out.println("Преди да отвори заведението, всеки клиент има следната сума:");
			for (int index = 0; index < NUMBER_OF_CLIENTS; index++) {
				System.out.print(clients.get(index).name + ": " + clients.get(index).getMoney() + "лв, ");
			}
			System.out.println();
			startWork(restaurant, (ArrayList<Client>) clients, (ArrayList<Steward>) restaurant.getStewards());
			System.out.println();
			System.out.println(
					"Всеки от клиентите си е платил сметката и е оставил 20% бакшиш на сервитьора. Останала им е следната сума:");
			for (int index = 0; index < NUMBER_OF_CLIENTS; index++) {
				System.out.print(clients.get(index).name + ": " + clients.get(index).getMoney() + "лв, ");
			}
			System.out.println();
			System.out.println(
					"Тъй като нямаше изцепки и не се наложи никой да мие чинии, сметката на ресторанта набъбна на: "
							+ restaurant.getBalance() + "лв.");
		} catch (IcorrectNameException | ClientException | IncorrectOrderException | NoMoneyException e) {
			System.out.println(e.getMessage());
		}

	}

}

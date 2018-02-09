package by.htp.les4Pizza;

public class Service {

	public Pizza cookPizza() {
		Pizza pizza = new Pizza();
		System.out.println("Your pizza is cooking...");

		for (int i = 5; i >= 1; i--) {
			System.out.println("Waiting '" + i + "' seconds, please!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return pizza;
	}

	public void delivery() {
		System.out.println("Your pizza will be delivered within an hour!");
	}
}

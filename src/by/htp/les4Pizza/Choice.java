package by.htp.les4Pizza;

public class Choice {

	public Pizza siciliya() {
		Pizza pizza = new Pizza();
		pizza.title = "Sicilian";
		return pizza;
	}

	public Pizza fourseason() {
		Pizza pizza = new Pizza();
		pizza.title = "Four seasons";
		return pizza;
	}

	public Pizza italy() {
		Pizza pizza = new Pizza();
		pizza.title = "Italian";
		return pizza;
	}

	public Pizza hawai() {
		Pizza pizza = new Pizza();
		pizza.title = "Hawaiian";
		return pizza;
	}

	public Pizza operation(int operation) {
		Pizza result = new Pizza();
		switch (operation) {
		case 1:
			result = siciliya();
			break;
		case 2:
			result = fourseason();
			break;
		case 3:
			result = italy();
			break;
		case 4:
			result = hawai();
			break;

		}
		return result;
	}
}

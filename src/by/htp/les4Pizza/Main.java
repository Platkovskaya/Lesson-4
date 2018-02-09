package by.htp.les4Pizza;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("What kind of pizza do you want?\n");
		System.out.println("1 - Sicilian.\n2 - Four Seasons.\n3 - Italian.\n4 - Hawaiian.\n");
		System.out.println("Make your choice:");

		Scanner sc = new Scanner(System.in);
		int operation = sc.nextInt();
		sc.close();

		Choice choice = new Choice();
		Pizza pizza = choice.operation(operation);
		System.out.println("You choice is '" + pizza.title + "' pizza!\n");

		Service servis = new Service();

		servis.cookPizza();

		System.out.println();

		servis.delivery();
	}

}

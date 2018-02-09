package by.htp.les4Calc;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.greetUser();
		System.out.println(" Enter two number: ");

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(" Enter sing: ");

		String operacion = sc.next();
		sc.close();

		int result;
		if (operacion.equals("+")) {
			result = calc.addition(x, y);
			System.out.println(result);

		} else if (operacion.equals("-")) {
			result = calc.subtraction(x, y);
			System.out.println(result);

		} else if (operacion.equals("*")) {
			result = calc.multiply(x, y);
			System.out.println(result);

		} else if (operacion.equals("/")) {

			result = calc.division(x, y);
			System.out.println(result);

		}

	}

}

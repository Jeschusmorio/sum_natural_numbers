package sum_natural_numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sum_natural_numbers_main {

	public static void main(String[] args) {
		int number = input();
		System.out.println();
		System.out.println("Rekursion:");
		System.out.println("Summe der natürlichen Zahlen bis "+number+" = "+sumRek(number)+"\n");
		System.out.println("Endrekursion:");
		System.out.println("Summe der natürlichen Zahlen bis "+number+" = "+sumEndRek(0, number));
	}
	public static int input() {
		int input = 0;
		boolean inputOk;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Geben Sie eine Grenze N ein: ");
			try {
				input = sc.nextInt();
				inputOk = true;
				if (input < 0) {
					System.out.println("Die Zahl muss positiv sein!");
					inputOk = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Sie müssen eine Zahl eingeben!");
				inputOk = false;
			}
		} while (!inputOk);
		return input;
	}
	public static int sumRek(int sumValue) {
		if (sumValue <= 0)
			return 0;
		return sumValue + sumRek(sumValue - 1);
	}
	public static int sumEndRek(int sumValue, int index) {
		if (index <= 0) {
			return sumValue;
		}
		return sumEndRek(sumValue + index, index - 1);
	}
}

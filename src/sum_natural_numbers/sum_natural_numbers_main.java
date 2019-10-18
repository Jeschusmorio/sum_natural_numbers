package sum_natural_numbers;

public class sum_natural_numbers_main {

	public static void main(String[] args) {
		int number = 6;
		int sum = sumRek(number);
		System.out.println("Summe der natürlichen Zahlen bis "+number+" = "+sum);
		int sum2 = sumEndRek(0, number);
		System.out.println("Summe der natürlichen Zahlen bis "+number+" = "+sum2);
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

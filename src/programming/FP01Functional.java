package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 3, 2, 4, 2, 3);
		printAllNumbersFunctional(numbers);
		printEvenNumbersFunctional(numbers);
	}

	private static void printAllNumbersFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}

	private static void printEvenNumbersFunctional(List<Integer> numbers) {
		numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
	}

}

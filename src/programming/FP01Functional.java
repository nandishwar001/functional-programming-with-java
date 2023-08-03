package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		printAllNumbersFunctional(List.of(1, 3, 2, 4, 2, 3));
	}

	private static void print(int num) {
		System.out.println(num);
	}

	private static void printAllNumbersFunctional(List<Integer> numbers) {

		numbers.stream().forEach(FP01Functional::print);
	}

}

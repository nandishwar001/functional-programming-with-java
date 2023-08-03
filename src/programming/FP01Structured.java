package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbersInStructured(List.of(1, 3, 2, 4, 2, 3));
	}

	private static void printAllNumbersInStructured(List<Integer> list) {
		for (Integer num : list) {
			System.out.println(num);
		}
	}

}

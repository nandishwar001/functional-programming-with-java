package programming;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Azure", "SQL");

		printAllCourses(courses);
		printSpringCourses(courses);
		printCoursesWithLengthAtleastFour(courses);
		List<Integer> numbers = List.of(8, 5, 3, 4, 9);
		printCubesOfOddNumbers(numbers);
		printNoOfCharactersInCourse(courses);
	}

	private static void printNoOfCharactersInCourse(List<String> courses) {
		courses.stream().map(course -> course.length()).forEach(System.out::println);
	}

	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number)
				.forEach(System.out::println);
	}

	private static void printCoursesWithLengthAtleastFour(List<String> courses) {
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
	}

	private static void printSpringCourses(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}

	private static void printAllCourses(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}

}

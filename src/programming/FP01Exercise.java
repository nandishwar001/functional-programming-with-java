package programming;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Azure", "SQL");

		printAllCourses(courses);
		printSpringCourses(courses);
		printCoursesWithLengthAtleastFour(courses);
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

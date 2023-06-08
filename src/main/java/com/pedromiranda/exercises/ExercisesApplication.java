package com.pedromiranda.exercises;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ExercisesApplication.class, args);
		Integer[] firstArray = {1, 10, 3, 7, 9};
		Integer[] secondArray = {-2, 1, -1, 0};

		// Exercise 1
		Exercise1.parseHexInt("1F");

		// Exercise 2
		 Exercise2.sumhighest(secondArray);

		// Exercise 3 (BONUS)
		Bonus.sqrt(2.0);
	}
}

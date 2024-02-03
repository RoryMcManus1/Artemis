/**
 * 
 */
package classes;

import java.util.Random;
import java.util.Scanner;
public class NasaQuiz {

	/**
	 * @param args
	 */
	public static void quiz() {

		// scanner to get user input
		Scanner scanner = new Scanner(System.in);

		try {
			String[] quizQuestions = {
					"NASA stands for the National ________ and Space Administration. \nastronoy - aeronautics - acrobatic - airplane ",
					"When was NASA founded? \n1945 - 1958 - 1969 - 1980",
					"True or false? The first person in space was from the United States.",
					"True or false? Apollo 1 was the first of NASA's manned flights into space.",
					"The command module was the part of the spacecraft that housed the crew. Which of these is not an Apollo command module name? \nGarfield - Gumdrop - Charlie Brown - Casper ",
					"How much do astronauts grow in space? \none to two inches - about 6 inches - about a foot - they dont grow",
					"A spacewalk is activity done outside of a spacecraft while in orbit above Earth. Which U.S. astronaut was the first to go on a spacewalk? \nJohn Glenn - Neil Armstrong -  Edward white - Jim Lovell",
					"What was the name of the first artificial satellite, which increased interest in space exploration in the United States? \nLaika - Orion - Kometa - Sputnik ",
					"When was the first U.S. space shuttle launched? \n1969 - 1975 - 1981 - 2000" };

			String[] quizAnswers = { "aeronautics", "1958", "false", "True", "Garfield", "one to two inches",
					"Edward white", "Sputnik", "1981" };

			Random random = new Random();
			String userAnswer;

			System.out.println("NASA Quiz");
			System.out.println("__________");
			System.out.println();

			int quizIndex;
			quizIndex = random.nextInt(quizQuestions.length);

			System.out.println(quizQuestions[quizIndex]);

			System.out.println("Your answer...");
			userAnswer = scanner.nextLine();
			// checking the user answer against the expected answer
			if (userAnswer.equalsIgnoreCase(quizAnswers[quizIndex])) {
				System.out.println("Well done - collect your points !");
				PlayerTurn.currentPlayer.addMoney(200);
			} else {
				System.out.println("Not a bad guess but it was " + quizAnswers[quizIndex]);
			}

			// if correct add money 200

		} catch (Exception exception) {
			System.out.println("The quiz master had a problem ... run the game again.");
		} finally {
			scanner.close();
			System.out.println("Thanks for playing");
		}

	}
}

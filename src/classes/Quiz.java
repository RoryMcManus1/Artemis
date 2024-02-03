package classes;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
	private static Scanner scanner = new Scanner(System.in);

	public static void spaceQuiz() {

		try {
			String[] quizQuestions = {
					"NASA stands for the National ________ and Space Administration. \nastronoy - aeronautics - acrobatic - airplane ",
					"When was NASA founded? \n1945 - 1958 - 1969 - 1980",
					"True or false? The first person in space was from the United States.",
					"True or false? Apollo 1 was the first of NASA's manned flights into space.",
					"The command module was the part of the spacecraft that housed the crew. Which of these is not an Apollo command module name? \nGarfield - Gumdrop - Charlie Brown - Casper ",

					"When was the first U.S. space shuttle launched? \n1969 - 1975 - 1981 - 2000" };

			String[] quizAnswers = { "Aeronautics", "1958", "false", "True", "Garfield", "sputnik", "1981" };

			Random random = new Random();
			String userAnswer;

			System.out.println("----------------------SPACE QUIZ----------------------");
			System.out.println("______________________________________________________");
			System.out.println();

			int quizIndex;
			quizIndex = random.nextInt(quizQuestions.length);

			System.out.println(quizQuestions[quizIndex]);

			System.out.println("Your answer...");
			userAnswer = scanner.next();

			// checking the user answer against the expected answer
			if (userAnswer.equalsIgnoreCase(quizAnswers[quizIndex])) {
				System.out.println("Well done - collect your points !");
				PlayerTurn.currentPlayer.addMoney(200);
				System.out.println(PlayerTurn.currentPlayer.getPlayerName() + "'s balance increased to:"
						+ PlayerTurn.currentPlayer.getPlayerBalance());

			} else {
				System.out.println("Not a bad guess but it was " + quizAnswers[quizIndex]);
				PlayerTurn.alreadyRolled = true;
			}


		} catch (Exception exception) {
			System.out.println("The quiz master had a problem ... run the game again.");

		}
	}

}

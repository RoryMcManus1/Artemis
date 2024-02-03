
package classes;

import java.util.Scanner;
public class GameRules {
	public static Scanner scan = new Scanner(System.in);

	/**
	 * method to create a delayed typing effect
	 * 
	 * @param s
	 * @param delay
	 * @throws InterruptedException
	 */
	public static void delay(String s, long delay) throws InterruptedException {
		// for loop delays individual String characters
		for (int i = 0; i < s.length(); i++) {

			System.out.print(s.charAt(i));
			// time is in milliseconds
			Thread.sleep(delay);
		}
		// this is the space in between lines
		System.out.println("");
	}

	/**
	 * method to display "mission brief" to the players before the game starts
	 */
	public static void displayMissionBrief() {
		String missionBreifUserOption;
		System.out.println("Would You Like to read the Mission Brief?  (Y/N)");

		missionBreifUserOption = scan.next();
		if (missionBreifUserOption.equalsIgnoreCase("Y")) {

			try {
				delay("\t\tMISSION BRIEF\n" + "*************************************************\n"
						+ "Artemis is the first step in the next era of human\nexploration, together"
						+ " with NASA and your help, we\ncan work to establish a sustainable presence"
						+ " on\nthe Moon to prepare for future missions to Mars.\n\n"
						+ "Your mission, should you choose to accept it, will be\nto develop"
						+ " the four essential systems,'Space Suits',\n'Launch Systems', "
						+ "'Ground Exploration' and\n'Lunar Landers', using Lunar credits."
						+ " You will have\nto manage your credits wisely in order to fully\ndevelop"
						+ " each system and to ensure the mission is a\nsuccess.\n\nGood luck!", 5L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Static method to display the game rules at the beginning of the game
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void displayGameRules() {
		String gameRulesUserOption;
		int gameRulesSectionChoice;
		System.out.println("Would You Like to read the Game Rules?  (Y/N)");
		gameRulesUserOption = scan.next();
		if (gameRulesUserOption.equalsIgnoreCase("Y")) {

			System.out.println("\t\tGAME RULES");
			System.out.println("____________________________________________________________________\n");
			do {
				System.out.println("Which section of the Rules would you like to read first?  (1-8)");
				System.out.println("1: STARTING");
				System.out.println("2: BUYING A SQUARE");
				System.out.println("3: LANDING ON AN OWNED SQAURE");
				System.out.println("4: DEVELOPING AN ELEMENT");
				System.out.println("5: FULLY DEVLOPING A SYSTEM");
				System.out.println("6: SPACE QUIZ");
				System.out.println("7: BANKRUPTCY");
				System.out.println("8: CONTINUE TO GAME");

				gameRulesSectionChoice = scan.nextInt();

				switch (gameRulesSectionChoice) {
				case 1:
					System.out.println("\t\tSTARTING");
					System.out.println("\nEach player will start the game with 2000 lunar credits.\n"
							+ "You will then proceed from the start sqaure and will each take\nturns rolling "
							+ "dice to move around the 12 sqaures of the board.\nYou will receive 500 lunar"
							+ " credits every time you pass 'Start'");
					System.out.println("____________________________________________________________________\n");
					break;
				case 2:
					System.out.println("\t      BUYING A SQUARE");
					System.out.println("\nIf a player lands on an unowned square, they will have the\n opportunity"
							+ "to purchase it, as long as they have enough credits. If a\nplayer does not want to"
							+ " purchase an unowned square that they have\nlanded on, they can offer it to another player"
							+ "at the usual cost.");
					System.out.println("____________________________________________________________________\n");
					break;
				case 3:
					System.out.println("\t   LANDING ON AN OWNED SQAURE");
					System.out.println(
							"\nIf a player lands on a square owned by another player they owe\nthat player contribution fee, "
									+ "which is determined by how developed\nthat square is. However, the player that is owed the fee has the\noption to "
									+ "decline in the interests of completing the game.");
					System.out.println("____________________________________________________________________\n");
					break;
				case 4:
					System.out.println("\t    DEVELOPING AN ELEMENT");
					System.out.println(
							"\nOnce all the squares in a system are owned, the owner can\nthen develop an element on"
									+ " each square.");
					System.out.println("____________________________________________________________________\n");
					break;
				case 5:
					System.out.println("\t  FULLY DEVLOPING A SYSTEM");
					System.out.println(
							"\nOnce a player has developed 3 elements in each square of their\nsystem, they can then fully develop it. "
									+ "This again will increase the\ncontribution fee due to the player if another\nplayer lands there.");
					System.out.println("____________________________________________________________________\n");
					break;
				case 6:
					System.out.println("\t\tSPACE QUIZ");
					System.out.println(
							"\nLanding on the 'Space Quiz' sqaure will prompt a NASA related question. \n"
							+ "if the player can answer this question correctly they will be awarded 200LC and will be able to roll to move again. \n"
							+ "if the player answers this question incorrectly they are unable to move from this space and are not awarded any LC");
					System.out.println("____________________________________________________________________\n");
					break;
				case 7:
					System.out.println("\t\tBANKRUPTCY");
					System.out.println(
							"\nIf a player has to contribute a number of lunar credits that will\nleave them with a balance of zero or less,"
									+ "they will be declared\nbankrupt and the game will end.\nThe state of play will be displayed following this event.");
					System.out.println("____________________________________________________________________\n");
					break;
				case 8:
					break;
				default:
					break;
				}
			} while (gameRulesSectionChoice != 8);
		}
	}

}

/**
 * 
 */
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CreatePlayers {

	public static List<Player> players = new ArrayList<Player>();

	public static Player p1;
	public static Player p2;
	public static Player p3;
	public static Player p4;

	private static String player1Name;
	private static String player2Name;
	private static String player3Name;
	private static String player4Name;
	public static String numPlayers;
	private static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void createPlayers() {

		System.out.println("Please Enter the Number of Players (2-4)");

		numPlayers = scan.next();

		if ((numPlayers.equalsIgnoreCase("2")
				|| (numPlayers.equalsIgnoreCase("3") || (numPlayers.equalsIgnoreCase("4"))))) {
			switch (numPlayers) {
			case "2":
				createPlayer1();
				createPlayer2();
				break;
			case "3":
				createPlayer1();
				createPlayer2();
				createPlayer3();

				break;
			case "4":
				createPlayer1();
				createPlayer2();
				createPlayer3();
				createPlayer4();
				break;
			default:

				break;
			}

		} else {
			System.out.println("Oops, Invalid Input");
			createPlayers();
		}
	}

	public static void createPlayer1() {
		do {
			System.out.println("Player 1 Please Enter Your Name (Max 10 Characters)");
			player1Name = scan.next().toUpperCase();
			p1 = new Player(1, player1Name, 2000, 1);

			PlayerTurn.currentPlayer = p1;
			players.add(p1);

		} while ((player1Name.length() > 10) || (player1Name.length() <= 2));
		System.out.println("Player 1 : " + player1Name);
	}

	public static void createPlayer2() {
		do {
			System.out.println("Player 2 Please Enter Your Name (Max 10 Characters)");
			player2Name = scan.next().toUpperCase();
			p2 = new Player(2, player2Name, 2000, 1);
			System.out.println("Player 2 : " + player2Name);

			PlayerTurn.otherPlayer = p2;
			players.add(p2);

			if (player2Name.equals(player1Name)) {
				System.out.println("error - name already in use - please enter another name");
			}

		} while ((player2Name.length() > 10) || (player2Name.length() <= 2) || (player2Name.equals(player1Name)));
	}

	public static void createPlayer3() {
		do {
			System.out.println("Player 3 Please Enter Your Name (Max 10 Characters)");
			player3Name = scan.next().toUpperCase();
			p3 = new Player(3, player3Name, 2000, 1);
			System.out.println("Player 3 : " + player3Name);

			PlayerTurn.otherPlayer = p3;
			players.add(p3);

			if (player3Name.equals(player1Name) || (player3Name.equalsIgnoreCase(player2Name))) {
				System.out.println("error - name already in use - please enter another name");
			}
		} while ((player3Name.length() > 10) || (player3Name.length() <= 2) || (player3Name.equals(player1Name))
				|| (player3Name.equals(player2Name)));
	}

	public static void createPlayer4() {
		do {
			System.out.println("Player 4 Please Enter Your Name (Max 10 Characters)");
			player4Name = scan.next().toUpperCase();
			p4 = new Player(4, player4Name, 2000, 1);
			System.out.println("Player 4 : " + player4Name);

			
			PlayerTurn.otherPlayer = p4;
			players.add(p4);
			
			
			if ((player4Name.equals(player1Name)) || (player4Name.equalsIgnoreCase(player2Name))
					|| (player4Name.equals(player3Name))) {
				System.out.println("error - name already in use - please enter another name");
			}
		} while ((player4Name.length() > 10) || (player4Name.length() <= 2) || (player4Name.equals(player1Name))
				|| (player4Name.equals(player2Name) || (player4Name.equals(player3Name))));
	}

}
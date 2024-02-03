package classes;


public class EndTurn2To4Players {

	public static void endTurn2Players() {
		// player must roll first before moving
		if (PlayerTurn.alreadyRolled) {
			if (PlayerTurn.currentPlayer == CreatePlayers.p1) {

				// if player1's turn, change to player 2's turn
				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.currentPlayer = CreatePlayers.p2;
				PlayerTurn.otherPlayer = CreatePlayers.p1;
				System.out.println("Ending Turn...");

			} else if (PlayerTurn.currentPlayer == CreatePlayers.p2) {

				// if player2's turn, change to player 1's turn
				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.currentPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p2;
				System.out.println("Ending Turn...");

				PlayerTurn.PlayerTurnOptions();

			}

		} else {
			System.out.println("Please Roll First!");
			PlayerTurn.PlayerTurnOptions();
		}
		PlayerTurn.PlayerTurnOptions();
	}

	public static void endTurn3Players() {
		// player must roll first before moving
		if (PlayerTurn.alreadyRolled) {
			if (PlayerTurn.currentPlayer == CreatePlayers.p1) {

				// if player1's turn, change to player 2's turn
				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.currentPlayer = CreatePlayers.p2;
				PlayerTurn.otherPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p3;
				System.out.println("Ending Turn...");

			} else if (PlayerTurn.currentPlayer == CreatePlayers.p2) {

				// if player2's turn, change to player 3's turn

				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.currentPlayer = CreatePlayers.p3;
				PlayerTurn.otherPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p2;
				System.out.println("Ending Turn...");

				PlayerTurn.PlayerTurnOptions();

			} else if (PlayerTurn.currentPlayer == CreatePlayers.p3) {

				// if player3's turn, change to player 1's turn
				CreatePlayers.p1.setTurn(true);
				CreatePlayers.p2.setTurn(false);
				CreatePlayers.p3.setTurn(false);
				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.currentPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p2;
				PlayerTurn.otherPlayer = CreatePlayers.p3;
				System.out.println("Ending Turn...");

				PlayerTurn.PlayerTurnOptions();

			}

		} else {
			System.out.println("Please Roll First!");
			PlayerTurn.PlayerTurnOptions();
		}
		PlayerTurn.PlayerTurnOptions();
	}

	public static void endTurn4Players() {
		// player must roll first before moving
		if (PlayerTurn.alreadyRolled) {
			if (PlayerTurn.currentPlayer == CreatePlayers.p1) {

				// if player1's turn, change to player 2's turn

				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.currentPlayer = CreatePlayers.p2;
				PlayerTurn.otherPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p3;
				PlayerTurn.otherPlayer = CreatePlayers.p4;
				System.out.println("Ending Turn...");

			} else if (PlayerTurn.currentPlayer == CreatePlayers.p2) {

				// if player2's turn, change to player 3's turn

				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;

				PlayerTurn.otherPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p2;
				PlayerTurn.currentPlayer = CreatePlayers.p3;
				PlayerTurn.otherPlayer = CreatePlayers.p4;
				System.out.println("Ending Turn...");

				PlayerTurn.PlayerTurnOptions();

			} else if (PlayerTurn.currentPlayer == CreatePlayers.p3) {

				// if player3's turn, change to player 4's turn

				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.otherPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p2;
				PlayerTurn.otherPlayer = CreatePlayers.p3;
				PlayerTurn.currentPlayer = CreatePlayers.p4;
				System.out.println("Ending Turn...");

				PlayerTurn.PlayerTurnOptions();

			} else if (PlayerTurn.currentPlayer == CreatePlayers.p4) {

				// if player3's turn, change to player 1's turn

				PlayerTurn.alreadyRolled = false;
				PlayerTurn.alreadyBought = false;
				PlayerTurn.currentPlayer = CreatePlayers.p1;
				PlayerTurn.otherPlayer = CreatePlayers.p2;
				PlayerTurn.otherPlayer = CreatePlayers.p3;
				PlayerTurn.otherPlayer = CreatePlayers.p4;
				System.out.println("Ending Turn...");

				PlayerTurn.PlayerTurnOptions();

			}

		} else {
			System.out.println("Please Roll First!");
			PlayerTurn.PlayerTurnOptions();
		}
		PlayerTurn.PlayerTurnOptions();
	}
}

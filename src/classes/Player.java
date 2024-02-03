package classes;

import java.util.ArrayList;

/**
 * @author RoryMcManus 40132363
 *
 */

public class Player {
	public ArrayList<Square> playerOwned = new ArrayList<Square>();
	public ArrayList<Square> fullyDevelopedElements = new ArrayList<Square>();
	int playerID;
	private String playerName;
	private int playerBalance;
	private int currentPosition;
	private boolean isTurn = true;

//	private String positionsOwned;

	// default constructor
	public Player() {

	}

	// constructor with ID,Name and Balance args
	public Player(int playerID, String playerName, int playerBalance, int currentPosition) {

		this.playerID = playerID;
		this.setPlayerName(playerName);
		this.setPlayerBalance(playerBalance);
		this.currentPosition = currentPosition;
	}

	// ---------------Player ID------------------------
	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	// ---------------Player Name------------------------
	public String getPlayerName() {
		return playerName;
	}

	// business rules for name length (1-10)
	public void setPlayerName(String playerName) {
		if ((playerName.length() > 10) || (playerName.length() <= 2)) {
			System.out.println("Player Name Invalid");
		} else {
			this.playerName = playerName;
		}
	}

	// ---------------Player Balance------------------------
	public void addMoney(int amt) {
		this.playerBalance = this.playerBalance + amt;// add the money taken from whoever to the player
	}

	public void takeMoney(int amt) {

		this.playerBalance = playerBalance - amt;// add the money taken from whoever to the player

	}

	public int getPlayerBalance() {

		return playerBalance;
	}

	public void setPlayerBalance(int playerBalance) {

		this.playerBalance = playerBalance;// add the money taken from whoever to the player
	}

	// ---------------Player Position------------------------
	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	// ---------------Player Turn------------------------
	public void setTurn(boolean turn) {
		isTurn = true;
	}

	public boolean isTurn() {
		return isTurn;
	}

	// ---------------Player Assets------------------------
	public void addPlayerAssets(Square square) {
		playerOwned.add(square);

	}

	public void removePlayerAssets(Square square) {
		playerOwned.remove(square);

	}

	public void addFullDevAssets(Square square) {
		fullyDevelopedElements.add(square);

	}

	// ---------------Position Name------------------------
	public static void positionName(int currentPosition) {
		switch (currentPosition) {
		case 1:
			System.out.print("LIVING QUARTERS");
			break;
		case 2:
			System.out.print("DATA COMMS");
			break;
		case 3:
			System.out.print("LIFE SUPPORT");
			break;
		case 4:
			System.out.print("ROCKET ENGINES");
			break;
		case 5:
			System.out.print("CREW & CARGO MODULE");
			break;
		case 6:
			System.out.print("FUEL SYSTEMS");
			break;
		case 7:
			System.out.print("SPACE QUIZ");
			break;
		case 8:
			System.out.print("NAVIGATION");
			break;
		case 9:
			System.out.print("OPERATIONS STAFF");
			break;
		case 10:
			System.out.print("CONSTRUCTION");
			break;
		case 11:
			System.out.print("LANDING SYSTEMS");
			break;
		case 12:
			System.out.print("ASCENT VEHICLE");
			break;
		default:
			break;

		}
	}

	public static void positionSystemName(int currentSystemPosition) {
		switch (currentSystemPosition) {
		case 0:
			System.out.print("BASE");
			break;
		case 1:
			System.out.print("SPACE SUITS");
			break;
		case 2:
			System.out.print("SPACE LAUNCH");
			break;
		case 3:
			System.out.print("GROUND EXPLORATION");
			break;
		case 4:
			System.out.print("LUNAR LANDERS");
			break;
		case 5:
			System.out.print("SPACE QUIZ");
			break;
		default:
			break;
		}
	}

	public void displayAll() {
		System.out.println("Player:" + playerID);
		System.out.println("Name:" + playerName);
		System.out.println("Lunar Credits:" + playerBalance);
		System.out.print("Current Position No.:");
		System.out.println(this.getCurrentPosition());
		System.out.print("Current Position Name:");
		positionName(this.getCurrentPosition());
		System.out.println();

		System.out.println("____________________________________________________________\n");
	}

	public void displayStateOfPlay() {
		System.out.println("----------------------STATE OF PLAY----------------------");
		System.out.println("Player:" + playerID);
		System.out.println("Name:" + playerName);
		System.out.println("Lunar Credits:" + playerBalance);
		System.out.print("Current Position No.:");
		System.out.println(this.getCurrentPosition());
		System.out.print("Current Position Name:");
		positionName(this.getCurrentPosition());
		System.out.println();
		DisplayAssets.displayAssets();
		DisplayAssets.displayOtherPlayerAssets2players();

		if (CreatePlayers.numPlayers.equalsIgnoreCase("3")) {
			DisplayAssets.displayOtherPlayerAssets3players();
		} else if (CreatePlayers.numPlayers.equalsIgnoreCase("4")) {
			DisplayAssets.displayOtherPlayerAssets4players();
		}

		System.out.println("____________________________________________________________\n");
		System.out.println("Total Systems Fully Optimised: " + PlayerTurn.totalSystemsDeveloped);
	}

//	public static void displayAssets() {
//		for(Square assets:playerOwned) {
//			System.out.println(assets.getSquareName());
//		}
//	}

}

/**
 * 
 */
package classes;

import java.util.ArrayList;
public class Board {
	public static ArrayList<Square> board = new ArrayList<Square>();
	public static ArrayList<GameSystems> gameSystems = new ArrayList<GameSystems>();

	/**
	 * @param args
	 */
	public static void addSquaresToBoard() {

		// create squares

		Square square1 = new Square(1, "BASE", "LIVING QUARTERS", false);

		Square square2 = new Square(2, "SPACE SUITS", "DATA COMMS", 300, 30, 60, 90, 120, false, false, false, false,
				1);
		Square square3 = new Square(3, "SPACE SUITS", "LIFE SUPPORT", 350, 35, 70, 105, 140, false, false, false, false,
				1);

		Square square4 = new Square(4, "SPACE LAUNCH", "ROCKET ENGINES", 500, 50, 100, 150, 200, false, false, false,
				false, 2);
		Square square5 = new Square(5, "SPACE LAUNCH", "CREW & CARGO MODULE", 250, 25, 50, 75, 100, false, false, false,
				false, 2);
		Square square6 = new Square(6, "SPACE LAUNCH", "FUEL SYSTEMS", 300, 30, 60, 90, 120, false, false, false, false,
				2);

		Square square7 = new Square(7, "SPACE QUIZ", "SPACE QUIZ", false);

		Square square8 = new Square(8, "GROUND EXPLORATION", "NAVIGATION", 300, 30, 60, 90, 120, false, false, false,
				false, 3);
		Square square9 = new Square(9, "GROUND EXPLORATION", "OPERATIONS STAFF", 350, 35, 70, 105, 140, false, false,
				false, false, 3);
		Square square10 = new Square(10, "GROUND EXPLORATION", "CONSTRUCTION", 300, 40, 80, 120, 160, false, false,
				false, false, 3);

		Square square11 = new Square(11, "LUNAR LANDERS", "LANDING SYSTEMS", 600, 60, 120, 180, 240, false, false,
				false, false, 4);
		Square square12 = new Square(12, "LUNAR LANDERS", "ASCENT VEHICLE", 600, 60, 120, 180, 240, false, false, false,
				false, 4);

		// create board

		board.add(square1);
		board.add(square2);
		board.add(square3);
		board.add(square4);
		board.add(square5);
		board.add(square6);
		board.add(square7);
		board.add(square8);
		board.add(square9);
		board.add(square10);
		board.add(square11);
		board.add(square12);
		
		
		

		// displayBoard(board);
		GameSystems s1 = new GameSystems("Space Suits", 2, false, 1, 150);
		GameSystems s2 = new GameSystems("Lunar Landers", 2, false, 4, 150);
		GameSystems s3 = new GameSystems("Ground Exploration", 3, false, 3, 150);
		GameSystems s4 = new GameSystems("Space Launch", 3, false, 2, 150);

		gameSystems.add(s1);
		gameSystems.add(s2);
		gameSystems.add(s3);
		gameSystems.add(s4);
		
		

	}

	/**
	 * display all of game board to screen
	 * 
	 * @param boards
	 */
	public static void displayBoard(ArrayList<Square> boards) {

		System.out.println("ArtemisLite Gameboard");
		System.out.println("______________________");
		System.out.println();
		for (Square b : boards) {
			System.out.println("Square " + b.getSquareNumber() + " : " + b.getSystemName() + " | " + b.getSquareName());
		}
	}

}

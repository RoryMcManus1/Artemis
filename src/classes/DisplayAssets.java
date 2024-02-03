package classes;

public class DisplayAssets {
	public static void displayAssets() {
		System.out.println("----------------------DISPLAY MY OWNED ELEMENTS----------------------");

		for (Square assets : PlayerTurn.currentPlayer.playerOwned) {
			String dev1;
			String dev2;
			String dev3;

			if (assets.isDev1()) {
				dev1 = "Yes";
			} else {
				dev1 = "No";
			}
			if (assets.isDev2()) {
				dev2 = "Yes";
			} else {
				dev2 = "No";
			}
			if (assets.isDev3()) {
				dev3 = "Yes";
			} else {
				dev3 = "No";
			}
//			
			System.out.println(PlayerTurn.currentPlayer.getPlayerName() + " Currently Owns -");
			System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName() + "\n"
					+ "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
					+ "Development Stage 3: " + dev3);
			System.out.println("--------------------------------------------");
		}
	}

	public static void displayOtherPlayerAssets2players() {
		System.out.println("----------------------DISPLAY OTHER PLAYERS' OWNED ELEMENTS----------------------");
		// if player 1 show p2 assets

		// --------------------------------------------------------------
		if (PlayerTurn.currentPlayer == CreatePlayers.p1) {

			for (Square assets : CreatePlayers.p2.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}
//				
				System.out.println(CreatePlayers.p2.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");

			}
			// p2 show p1 assets
			// --------------------------------------------------------------
		} else if (PlayerTurn.currentPlayer == CreatePlayers.p2) {
			for (Square assets : CreatePlayers.p1.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p1.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
			}
		}
	}

	public static void displayOtherPlayerAssets3players() {

		System.out.println("----------------------DISPLAY OTHER PLAYERS' OWNED ELEMENTS----------------------");
		// if player 1 show p2 & p3 assets

		if (PlayerTurn.currentPlayer == CreatePlayers.p1) {
			// player 2 assets--------------------------------------------------------------
			for (Square assets : CreatePlayers.p2.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p2.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p3 assets
			}
			for (Square assets : CreatePlayers.p3.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p3.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p4's assets
			}

			// if p2 show p1 & p3 assets
			// --------------------------------------------------------------
		} else if (PlayerTurn.currentPlayer == CreatePlayers.p2) {
			for (Square assets : CreatePlayers.p1.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p1.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p3 assets
			}
			for (Square assets : CreatePlayers.p3.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p3.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");

			}
			// if p3 show p1 & p2 assets
		} else if (PlayerTurn.currentPlayer == CreatePlayers.p3) {
			for (Square assets : CreatePlayers.p1.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p1.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p2 assets
			}
			for (Square assets : CreatePlayers.p2.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p2.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p4's assets
			}
		}
	}

	public static void displayOtherPlayerAssets4players() {

		System.out.println("----------------------DISPLAY OTHER PLAYERS' OWNED ELEMENTS----------------------");
		// if player 1 show p2,p3,p4 assets
		// --------------------------------------------------------------
		if (PlayerTurn.currentPlayer == CreatePlayers.p1) {

			for (Square assets : CreatePlayers.p2.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p2.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p3 assets
			}
			for (Square assets : CreatePlayers.p3.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p3.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p4's assets
			}
			for (Square assets : CreatePlayers.p4.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}
//			
				System.out.println(CreatePlayers.p4.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
			}
			// if p2 show p1 assets
			// --------------------------------------------------------------
		} else if (PlayerTurn.currentPlayer == CreatePlayers.p2) {
			for (Square assets : CreatePlayers.p1.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p1.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p3 assets
			}
			for (Square assets : CreatePlayers.p3.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p3.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3 + "\n" + "\n" + "Fully Developed:     ");
				System.out.println("--------------------------------------------");
				// show p4's assets
			}
			for (Square assets : CreatePlayers.p4.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p4.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
			}
			// if p3 show p1 assets
			// --------------------------------------------------------------
		} else if (PlayerTurn.currentPlayer == CreatePlayers.p3) {
			for (Square assets : CreatePlayers.p1.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p1.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p2 assets
			}
			for (Square assets : CreatePlayers.p2.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p2.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p4's assets
			}
			for (Square assets : CreatePlayers.p4.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}
//				if (assets.isDevMax()) {
//					devMax = "Yes";
//				} else {
//					devMax = "No";
//				}
				System.out.println(CreatePlayers.p4.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
			}
			// If player 4 show p1,p2,p3
		} else if (PlayerTurn.currentPlayer == CreatePlayers.p4) {
			for (Square assets : CreatePlayers.p1.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p1.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p2 assets
			}
			for (Square assets : CreatePlayers.p2.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

				if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p2.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
				// show p4's assets
			}
			for (Square assets : CreatePlayers.p3.playerOwned) {
				String dev1;
				String dev2;
				String dev3;

		
		if (assets.isDev1()) {
					dev1 = "Yes";
				} else {
					dev1 = "No";
				}
				if (assets.isDev2()) {
					dev2 = "Yes";
				} else {
					dev2 = "No";
				}
				if (assets.isDev3()) {
					dev3 = "Yes";
				} else {
					dev3 = "No";
				}

				System.out.println(CreatePlayers.p3.getPlayerName() + " Currently Owns -");
				System.out.println("System: " + assets.getSystemName() + "\n" + "Element: " + assets.getSquareName()
						+ "\n" + "Development Stage 1: " + dev1 + "\n" + "Development Stage 2: " + dev2 + "\n"
						+ "Development Stage 3: " + dev3);
				System.out.println("--------------------------------------------");
			}
		}

	}
}

package classes;

public class GameEnding {
	public static class GameEnd {

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
		 * Message displayed at the end of the game if completed (all systems developed)
		 */
		public static void GameWin() {
			try {
				delay("Congratulations team! Thanks to your hard work and co-operation,\n you have "
						+ "successfully developed each of the critical systems\n needed to "
						+ "to facilitate our future missions to the Moon and\nbeyond. Artemis is now"
						+ " ready for launch. All systems are GO!\n\n"
						+ "*****************************************************************\n"
						+ "\n 2021 :\n\n'NASA Lands first of their Commercial Lunar Payload \n Services"
						+ "(CLPS) on the Moon!'\n\n'NASA Launches the first Orion spacecraft atop their Space\n"
						+ "Launch System(SLS) Rocket on Artemis I'\n\n"
						+ "\n*****************************************************************\n"
						+ "\n2023 :\n\n'NASA Successfully launches Artemis II! First crewed spacecraft\n"
						+ "to travel beyond low Earth Orbit since Apollo 17 in 1972! Four\nastronaughts"
						+ " to use Orion capsule for a lunar flyby for a maximum\nof 21 days'\n\n"
						+ "\n*****************************************************************\n"
						+ "\n2024 :\n\n'NASA Successfully Launches Artemis III. The second crewed "
						+ "Artemis\nmission aboard thr Orion spacecraft is a go!'\n\n'NASA lands the first "
						+ "woman and the next man on"
						+ " the moon! Artemis III\ncrew capably land on the Moon's south polar region"
						+ " using the state\nof the art Human Landing System (HLS). The crew will remain on the\n"
						+ "surface for 6.5 days, performing four spacewalks and a variety of\nscientific"
						+ " observations.", 5L);

				PlayerTurn.stateOPlay();
				DisplayAssets.displayAssets();

				if (CreatePlayers.numPlayers.equalsIgnoreCase("2")) {
					DisplayAssets.displayOtherPlayerAssets2players();
				}
				if (CreatePlayers.numPlayers.equalsIgnoreCase("3")) {
					DisplayAssets.displayOtherPlayerAssets3players();
				}
				if (CreatePlayers.numPlayers.equalsIgnoreCase("4")) {
					DisplayAssets.displayOtherPlayerAssets4players();
				}
				System.exit(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void GameLose() {

			try {
				System.out.println("You Are Bankrupt!");
				delay("Due to a mismanagement of resources, your team lacks the ability to secure safe travel through the stars! \n MISSION FAILED, We'll get 'em next time!.",
						20L);
				PlayerTurn.stateOPlay();
				DisplayAssets.displayAssets();

				if (CreatePlayers.numPlayers.equalsIgnoreCase("2")) {
					DisplayAssets.displayOtherPlayerAssets2players();
				}
				if (CreatePlayers.numPlayers.equalsIgnoreCase("3")) {
					DisplayAssets.displayOtherPlayerAssets3players();
				}
				if (CreatePlayers.numPlayers.equalsIgnoreCase("4")) {
					DisplayAssets.displayOtherPlayerAssets4players();
				}
				System.exit(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void displayPlayerQuitMessage() {
			System.out.println("A Player has Quit!");
					try {
						delay(	"A key member of the Artemis Team has bowed to the monumental pressure of Space Travel, sadly the mission is unable to continue. \\n MISSION FAILED, We'll get 'em next time!", 5L);
						PlayerTurn.stateOPlay();
						DisplayAssets.displayAssets();

						if (CreatePlayers.numPlayers.equalsIgnoreCase("2")) {
							DisplayAssets.displayOtherPlayerAssets2players();
						}
						if (CreatePlayers.numPlayers.equalsIgnoreCase("3")) {
							DisplayAssets.displayOtherPlayerAssets3players();
						}
						if (CreatePlayers.numPlayers.equalsIgnoreCase("4")) {
							DisplayAssets.displayOtherPlayerAssets4players();
						}
						System.exit(0);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
	}

}

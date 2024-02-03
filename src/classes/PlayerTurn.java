package classes;

import java.util.Scanner;

import classes.GameEnding.GameEnd;

public class PlayerTurn {

	public static Scanner scan = new Scanner(System.in);
	public static boolean alreadyRolled = false;
	public static boolean alreadyDeveloped = false;
	public static boolean alreadyBought = false;
	public static boolean isSys1Op = false, isSys2Op = false, isSys3Op = false, isSys4Op = false;
	public static int totalSystemsDeveloped = 0;
	public static Player currentPlayer;
	public static Player otherPlayer;
	public static int sys1, sys2, sys3, sys4;

	public static void PlayerTurnOptions() {
		String playerTurnOption;
		if (currentPlayer.isTurn()) {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------PLAYER " + currentPlayer.getPlayerID()
							+ " TURN OPTIONS---------------------------------------------------------------");
			System.out.println("Please Choose An option 1-8");
			System.out.println(
					"1: View Situation Report \t 3: Aquire Element \t 5: Display My Assets \t     		 7: Optimise System");
			System.out.println(
					"2: Roll And Move         \t 4: Upgrade Element \t 6: Display Other Player's Assets \t 8: Do Nothing (End Turn) \t Q: Quit Game");
			System.out.println();

			playerTurnOption = scan.next();

			switch (playerTurnOption) {
			case "1":
				situationReport();
				PlayerTurnOptions();
				break;
			case "2":
				diceRollAndMove();

				break;
			case "3":
				buy();
				break;
			case "4":
				developElementsFixed();
				PlayerTurnOptions();

				break;
			case "5":
				DisplayAssets.displayAssets();
				PlayerTurnOptions();
				break;
			case "6":
				if (CreatePlayers.numPlayers.equalsIgnoreCase("2")) {
					DisplayAssets.displayOtherPlayerAssets2players();
				} else if (CreatePlayers.numPlayers.equalsIgnoreCase("3")) {
					DisplayAssets.displayOtherPlayerAssets3players();
				} else if (CreatePlayers.numPlayers.equalsIgnoreCase("4")) {
					DisplayAssets.displayOtherPlayerAssets4players();
				}
				PlayerTurnOptions();
				break;
			case "8":
				if (CreatePlayers.numPlayers.equalsIgnoreCase("2")) {
					EndTurn2To4Players.endTurn2Players();
				} else if (CreatePlayers.numPlayers.equalsIgnoreCase("3")) {
					EndTurn2To4Players.endTurn3Players();
				} else if (CreatePlayers.numPlayers.equalsIgnoreCase("4")) {
					EndTurn2To4Players.endTurn4Players();
				}
				break;
			case "7":
				developSystem();
				PlayerTurnOptions();
				break;
			case "Q":
			case "q":
				playerQuit();

				break;
			default:
				System.out.println("Invalid Input");
				PlayerTurnOptions();

			}

		}

	}

	public static void diceRollAndMove() {
		if (!alreadyRolled) {

			int diceOne;
			int diceTwo;

			int diceTotal;

			diceOne = (int) (Math.random() * 6 + 1);
			diceTwo = (int) (Math.random() * 6) + 1;

			diceTotal = diceOne + diceTwo;
			System.out.println();
			System.out.println("----------------------ROLLING DICE----------------------");
			System.out.println("Rolling the dice...");
			System.out.println("The first dice rolls : " + diceOne);
			System.out.println("The second dice rolls : " + diceTwo);
			System.out.println("Your total roll : " + diceTotal);
			System.out.println();
			System.out.println("----------------------MOVING PLAYER---------------------");

			int temp = diceTotal + currentPlayer.getCurrentPosition();
			int tempPosition = currentPlayer.getCurrentPosition();
			int sysPosition = 0;

			if (temp > 12) {
				temp %= 12;
				// add 200 for passing GO
				System.out.println(
						currentPlayer.getPlayerName() + " RESTED in the LIVING QUARTERS Collect your credits: 200LC ");
				System.out.println("200LC added to " + currentPlayer.getPlayerName() + "'s Credit Balance");
				System.out.println(currentPlayer.getPlayerName() + "'s Credit Balance is now :"
						+ currentPlayer.getPlayerBalance());
				System.out.println();
				System.out.println();

				currentPlayer.addMoney(200);

			}

			currentPlayer.setCurrentPosition(temp);
			if (currentPlayer.getCurrentPosition() == 1) {
				sysPosition = 0;
			}
			if ((currentPlayer.getCurrentPosition() == 2) || (currentPlayer.getCurrentPosition() == 3)) {
				sysPosition = 1;
			}
			if ((currentPlayer.getCurrentPosition() >= 4) && (currentPlayer.getCurrentPosition() <= 6)) {
				sysPosition = 2;
			}
			if ((currentPlayer.getCurrentPosition() >= 8) && (currentPlayer.getCurrentPosition() <= 10)) {
				sysPosition = 3;
			}
			if ((currentPlayer.getCurrentPosition() == 11) || (currentPlayer.getCurrentPosition() == 12)) {
				sysPosition = 4;
			}

			System.out.print(currentPlayer.getPlayerName() + " has been moved from: ");
			Player.positionName(tempPosition);
			System.out.print("\n");
			System.out.print("to: ");
			Player.positionName(currentPlayer.getCurrentPosition());
			System.out.print(" of the: ");
			Player.positionSystemName(sysPosition);
			System.out.print(" System");
			System.out.println();
			rent();

			if (currentPlayer.getCurrentPosition() == 7) {
				sysPosition = 5;
				Quiz.spaceQuiz();
				PlayerTurnOptions();

			}
			alreadyRolled = true;

			PlayerTurnOptions();

			alreadyRolled = true;

		} else {
			System.out.println("Already Rolled!");
			PlayerTurnOptions();
		}

	}

	public static void rent() {
		Options op = new Options();
		for (int i = 0; i < otherPlayer.playerOwned.size(); i++) {
			// -----------------------------------------------------------RENT--------------------------------------------------------------------------------------------
			// if player lands on a square owned by the other players, the player owes rent
			// based on the development stage of that square
			if ((otherPlayer.playerOwned.get(i).getSquareNumber() == currentPlayer.getCurrentPosition())
					&& (!otherPlayer.playerOwned.get(i).isDev1())) {
				op.acceptRentLvl0Option();
			} else if ((otherPlayer.playerOwned.get(i).getSquareNumber() == currentPlayer.getCurrentPosition())
					&& (otherPlayer.playerOwned.get(i).isDev1())) {
				op.acceptRentLvl1Option();
			} else if ((otherPlayer.playerOwned.get(i).getSquareNumber() == currentPlayer.getCurrentPosition())
					&& (otherPlayer.playerOwned.get(i).isDev2())) {
				op.acceptRentLvl2Option();
			} else if ((otherPlayer.playerOwned.get(i).getSquareNumber() == currentPlayer.getCurrentPosition())
					&& (otherPlayer.playerOwned.get(i).isDev3())) {
				op.acceptRentLvl3Option();
			}
		}

	}

	public static void buy() {
		System.out.println("----------------------AQUIRE ELEMENT----------------------");
		if (!alreadyBought) {
			String buyVacantOption, sellOwnedOption;
			int currentSpace = currentPlayer.getCurrentPosition();

			for (Square square : Board.board) {
				// if the players position matches the square number
				if (currentSpace == square.getSquareNumber()) {

					// if the Element can be owned and is currently not owned
					if ((square.CanBeOwned()) || (!square.isOwned())) {
						if ((square.getSquareNumber() <= 1) || (square.getSquareNumber() == 7)) {
							System.out.println("Sorry this Element cannot be owned");
							PlayerTurnOptions();

						}
						System.out.println(
								square.getSquareName() + " is currently Vacant Would you like to aquire it for:"
										+ square.getCost() + "? (Y/N) ");
						buyVacantOption = scan.next();
						// if the player wants to buy it
						if (buyVacantOption.equalsIgnoreCase("Y")) {// BUYING
																	// VACANT----------------------------------------------------------------------------------
							// if the player can afford it

							if (currentPlayer.getPlayerBalance() - square.getCost() > 0) {
								// add square to assets
								System.out.println(
										"Player: " + currentPlayer.getPlayerName() + " Aquired the vacant Element: "
												+ square.getSquareName() + " for: " + square.getCost());
								currentPlayer.addPlayerAssets(square);

								// remove cost of asset from balance
								System.out.println("a total of: " + square.getCost() + " was removed from "
										+ currentPlayer.getPlayerName() + "'s balance ");

								currentPlayer.takeMoney(square.getCost());
								System.out.println(PlayerTurn.currentPlayer.getPlayerName()
										+ "'s Credit Balance is now :" + PlayerTurn.currentPlayer.getPlayerBalance());

								square.setOwned(true);
								alreadyBought = true;
								PlayerTurnOptions();

							} else {
								GameEnd.GameLose();
							}
						} else {
							PlayerTurnOptions();

						}
						// if square can be owned but is already owned
					} else if ((square.CanBeOwned() == false) && (square.isOwned() == true)) {// BUYING
																								// OWNED----------------------------------------------------------------------------------

						if (otherPlayer.playerOwned.contains(square)) {
							System.out.print("Sorry " + square.getSquareName() + " is already owned by:");
							System.out.println(otherPlayer.getPlayerName());
							System.out.println("Would " + otherPlayer.getPlayerName() + " like to sell this element?");
							sellOwnedOption = scan.next();
							// if the otherPlayer wishes to sell
							if (sellOwnedOption.equalsIgnoreCase("Y")) {
								// if current player can afford
								if (currentPlayer.getPlayerBalance() - square.getCost() > 0) {
									System.out.println(currentPlayer.getPlayerName() + " sold "
											+ PlayerTurn.otherPlayer.getPlayerName() + "-" + square.getSquareName());
									System.out.println("a total of: " + square.getCost() + " was removed from "
											+ currentPlayer.getPlayerName() + "'s balance ");

									currentPlayer.takeMoney(square.getCost());
									System.out.println(
											PlayerTurn.currentPlayer.getPlayerName() + "'s Credit Balance is now :"
													+ PlayerTurn.currentPlayer.getPlayerBalance());
									System.out.println(PlayerTurn.otherPlayer.getPlayerName()
											+ "'s Credit Balance is now :" + PlayerTurn.otherPlayer.getPlayerBalance());
									if (currentPlayer.getPlayerBalance() <= 0) {

										GameEnd.GameLose();
									} else {
										System.out.println(square.getSquareName() + "has been removed from "
												+ PlayerTurn.otherPlayer.getPlayerName() + "'s owned list");
										System.out.println();
										System.out.println(square.getSquareName() + " is now owned by "
												+ PlayerTurn.currentPlayer.getPlayerName());
										currentPlayer.addPlayerAssets(square);
										otherPlayer.addMoney(square.getCost());
										otherPlayer.removePlayerAssets(square);
										square.setOwned(true);
										alreadyBought = true;
										PlayerTurnOptions();
									}

								}

							} else {
								System.out.println("Sorry, this player refuses to sell");
								PlayerTurnOptions();
							}
						} else {
							System.out.println("You Currently own this element");
							PlayerTurnOptions();
						}
					}
				}

			}
		} else {
			System.out.println("Already Purchased!");
			PlayerTurnOptions();
		}
	}

	public static void developElementsFixed() {
		Options op = new Options();
		System.out.println("----------------------UPGRADE ELEMENTS----------------------");

		// check the player owned list is not empty
		if (!currentPlayer.playerOwned.isEmpty()) {
			// loop through each element in list and ask to develop
			op.upgradeElementOptions();
		} else {
			System.out.println("No Elements to Upgrade");
			PlayerTurnOptions();
		}

	}

	public static void developSystem() {

		int systemElementsOwned1 = 0, systemElementsOwned2 = 0, systemElementsOwned3 = 0, systemElementsOwned4 = 0;
		String developSystemOption;

		System.out.println("----------------------OPTIMISE SYSTEM----------------------");

		if ((totalSystemsDeveloped != 4)) {
			if (!currentPlayer.fullyDevelopedElements.isEmpty()) {
				for (Square fullyDev : currentPlayer.fullyDevelopedElements) {
					// IF THE ELEMENT BELONGS TO SYSTEM 1
					if (fullyDev.getSystemNum() == 1) {
						systemElementsOwned1++;
						if (systemElementsOwned1 == 2) {
							System.out.println("You currently have " + systemElementsOwned1 + "/"
									+ "2 Fully Upgraded Elements in this system");
							System.out.println(
									"You are able to Fully Optimise this whole system, Would you Like to Optimise: "
											+ fullyDev.getSystemName() + "(Y/N)");
							developSystemOption = scan.next();
							if (developSystemOption.equalsIgnoreCase("y")) {
								if (!isSys1Op) {
									if ((PlayerTurn.currentPlayer.getPlayerBalance()
											- GameSystems.systemDevelopmentCost > 0)) {
										System.out.println(PlayerTurn.currentPlayer.getPlayerName()
												+ " has Fully Optimised the SPACE SUITS System");
										System.out.println("subtracting 150LC from "
												+ PlayerTurn.currentPlayer.getPlayerName() + "'s balance");
										PlayerTurn.currentPlayer.takeMoney(GameSystems.systemDevelopmentCost);
										if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

											GameEnd.GameLose();

										}
										System.out.println(
												(PlayerTurn.currentPlayer.getPlayerName() + "'s new balance is: "
														+ (PlayerTurn.currentPlayer.getPlayerBalance() + "LC")));
										System.out.println();
										isSys1Op = true;

										++totalSystemsDeveloped;
										if (totalSystemsDeveloped == 4) {
											GameEnd.GameWin();
										}

									}
								} else {
									System.out.println(fullyDev.getSystemName() + " Already Online");
									System.out.println();
								}
							}
						}

					}
					if (fullyDev.getSystemNum() == 2) {
						systemElementsOwned2++;
						if (systemElementsOwned2 == 3) {
							System.out.println("You currently have " + systemElementsOwned2 + "/"
									+ "3 Fully Upgraded Elements in this system");
							System.out.println(
									"You are able to Fully Optimise this whole system, Would you Like to Optimise: "
											+ fullyDev.getSystemName() + "(Y/N)");
							developSystemOption = scan.next();
							if (developSystemOption.equalsIgnoreCase("y")) {
								if (!isSys2Op) {
									if ((PlayerTurn.currentPlayer.getPlayerBalance()
											- GameSystems.systemDevelopmentCost > 0)) {
										System.out.println(PlayerTurn.currentPlayer.getPlayerName()
												+ " has Fully Optimised the SPACE SUITS System 2");
										System.out.println("subtracting 150LC from "
												+ PlayerTurn.currentPlayer.getPlayerName() + "'s balance");
										PlayerTurn.currentPlayer.takeMoney(GameSystems.systemDevelopmentCost);
										if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

											GameEnd.GameLose();

										}
										System.out.println(
												(PlayerTurn.currentPlayer.getPlayerName() + "'s new balance is: "
														+ (PlayerTurn.currentPlayer.getPlayerBalance() + "LC")));
										System.out.println();
										isSys2Op = true;

										++totalSystemsDeveloped;
										if (totalSystemsDeveloped == 4) {
											GameEnd.GameWin();
										}

									}
								} else {
									System.out.println(fullyDev.getSystemName() + " Already Online");
									System.out.println();
								}
							}
						}

					}

					if (fullyDev.getSystemNum() == 3) {
						systemElementsOwned3++;
						if (systemElementsOwned3 == 3) {
							System.out.println("You currently have " + systemElementsOwned3 + "/"
									+ "3 Fully Upgraded Elements in this system");
							System.out.println(
									"You are able to Fully Optimise this whole system, Would you Like to Optimise: "
											+ fullyDev.getSystemName() + "(Y/N)");
							developSystemOption = scan.next();
							if (developSystemOption.equalsIgnoreCase("y")) {
								if (!isSys3Op) {
									if ((PlayerTurn.currentPlayer.getPlayerBalance()
											- GameSystems.systemDevelopmentCost > 0)) {
										System.out.println(PlayerTurn.currentPlayer.getPlayerName()
												+ " has Fully Optimised the  System 3");
										System.out.println("subtracting 150LC from "
												+ PlayerTurn.currentPlayer.getPlayerName() + "'s balance");
										PlayerTurn.currentPlayer.takeMoney(GameSystems.systemDevelopmentCost);
										if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

											GameEnd.GameLose();

										}
										System.out.println(
												(PlayerTurn.currentPlayer.getPlayerName() + "'s new balance is: "
														+ (PlayerTurn.currentPlayer.getPlayerBalance() + "LC")));
										System.out.println();
										isSys3Op = true;

										++totalSystemsDeveloped;
										if (totalSystemsDeveloped == 4) {
											GameEnd.GameWin();
										}

									}
								} else {
									System.out.println(fullyDev.getSystemName() + " Already Online");
									System.out.println();
								}
							}
						}

					}

					if (fullyDev.getSystemNum() == 4) {
						systemElementsOwned4++;
						if (systemElementsOwned4 == 2) {
							System.out.println("You currently have " + systemElementsOwned4 + "/"
									+ "2 Fully Upgraded Elements in this system");
							System.out.println(
									"You are able to Fully Optimise this whole system, Would you Like to Optimise: "
											+ fullyDev.getSystemName() + "(Y/N)");
							developSystemOption = scan.next();
							if (developSystemOption.equalsIgnoreCase("y")) {
								if (!isSys4Op) {
									if ((PlayerTurn.currentPlayer.getPlayerBalance()
											- GameSystems.systemDevelopmentCost > 0)) {
										System.out.println(PlayerTurn.currentPlayer.getPlayerName()
												+ " has Fully Optimised the  System 4");
										System.out.println("subtracting 150LC from "
												+ PlayerTurn.currentPlayer.getPlayerName() + "'s balance");
										PlayerTurn.currentPlayer.takeMoney(GameSystems.systemDevelopmentCost);
										if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

											GameEnd.GameLose();

										}
										System.out.println(
												(PlayerTurn.currentPlayer.getPlayerName() + "'s new balance is: "
														+ (PlayerTurn.currentPlayer.getPlayerBalance() + "LC")));
										System.out.println();
										isSys4Op = true;

										++totalSystemsDeveloped;
										if (totalSystemsDeveloped == 4) {
											GameEnd.GameWin();
										}

									}
								} else {
									System.out.println(fullyDev.getSystemName() + " Already Online");
									System.out.println();
								}
							}
						}
					}

				}
			} else {

				System.out.println(
						"All elements in a system must be fully upgraded before the system can be optimised! ");
			}
		} else {
			System.out.println("All Systems Developed");
			GameEnd.GameWin();
		}
	}

	public static void playerQuit() {
		String confirmQuit;
		System.out.println("----------------------QUIT MISSION----------------------");
		System.out.println("Are you sure you would like to quit the mission? All progress will be lost! (Y/N)");
		confirmQuit = scan.next();
		if (confirmQuit.equalsIgnoreCase("Y")) {
			GameEnd.displayPlayerQuitMessage();
		} else {
			System.out.println("A wise choice!");
			
		}

	}

	public static void situationReport() {

		System.out.println("----------------------SITUATION REPORT----------------------");

		for (Player player : CreatePlayers.players) {
			player.displayAll();
		}
		System.out.println("Total Systems Fully Optimised: " + totalSystemsDeveloped);
	}

	public static void stateOPlay() {

		System.out.println("----------------------STATE OF PLAY----------------------");
		for (Player player : CreatePlayers.players) {
			player.displayAll();
		}
		System.out.println("Total Systems Fully Optimised: " + totalSystemsDeveloped);
	}

}

package classes;

import java.util.Scanner;

import classes.GameEnding.GameEnd;
import classes.Interfaces.IOptionsGameStart;
import classes.Interfaces.IOptionsRent;
import classes.Interfaces.IOptionsUpgradeElement;
import classes.Interfaces.IRentPayments;

public class Options implements IOptionsGameStart, IOptionsRent, IOptionsUpgradeElement, IRentPayments {
	private static Scanner scan = new Scanner(System.in);
	String acceptRentOption;
	String upgradeElementOption;

	public void gameStartOption() {
		String playerStartOption;
		System.out.println("Would you like to continue? (Y/N)");

		playerStartOption = scan.nextLine();

		if (playerStartOption.equalsIgnoreCase("y")) {
		
			Board.addSquaresToBoard();
			CreatePlayers.createPlayers();
			GameRules.displayMissionBrief();
			GameRules.displayGameRules();
			PlayerTurn.PlayerTurnOptions();

		} else if (playerStartOption.equalsIgnoreCase("N")) {

			System.out.println("Goodbye!");
		} else {
			gameStartOption();
		}
		scan.close();
	}

	public void acceptRentLvl0Option() {
		String acceptRentOption;
		System.out
				.println("You arrived at " + PlayerTurn.otherPlayer.getPlayerName() + "' element and as a result owe a "
						+ Square.dev0rent + "LC Reimbursement for the resources used while at this element");
		System.out.println(
				"Does " + PlayerTurn.otherPlayer.getPlayerName() + " wish to accept the Reimbursement? (Y/N) ");
		acceptRentOption = scan.next();
		// if the other player wishes to accept the rent
		if ((acceptRentOption.equalsIgnoreCase("Y")
				&& (PlayerTurn.currentPlayer.getPlayerBalance() - Square.dev0rent > 0))) {

			PlayerTurn.currentPlayer.takeMoney(Square.dev0rent);
			if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

				GameEnd.GameLose();

			}
			


			rentPayment();

		} else if (acceptRentOption.equalsIgnoreCase("N")) {
			System.out.println("TeamWork at its finest!");

		}

	}

	@Override
	public void acceptRentLvl1Option() {
		System.out
				.println("You arrived at " + PlayerTurn.otherPlayer.getPlayerName() + "' element and as a result owe a "
						+ Square.dev1rent + "LC Reimbursement for the resources used while at this element");
		System.out.println(
				"Does " + PlayerTurn.otherPlayer.getPlayerName() + " wish to accept the Reimbursement? (Y/N) ");
		acceptRentOption = scan.next();
		// if the other player wishes to accept the rent
		if ((acceptRentOption.equalsIgnoreCase("Y")
				&& (PlayerTurn.currentPlayer.getPlayerBalance() - Square.dev1rent > 0))) {
			PlayerTurn.currentPlayer.takeMoney(Square.dev1rent);
			
			rentPayment();
			PlayerTurn.PlayerTurnOptions();
			if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

				GameEnd.GameLose();

			}
		} else {
			System.out.println("TeamWork at its finest!");
			PlayerTurn.PlayerTurnOptions();

		}

	}

	@Override
	public void acceptRentLvl2Option() {
		System.out
				.println("You arrived at " + PlayerTurn.otherPlayer.getPlayerName() + "' element and as a result owe a "
						+ Square.dev2rent + "LC Reimbursement for the resources used while at this element");
		System.out.println(
				"Does " + PlayerTurn.otherPlayer.getPlayerName() + " wish to accept the Reimbursement? (Y/N) ");
		acceptRentOption = scan.next();
		// if the other player wishes to accept the rent
		if ((acceptRentOption.equalsIgnoreCase("Y")
				&& (PlayerTurn.currentPlayer.getPlayerBalance() - Square.dev2rent > 0))) {
			rentPayment();
			PlayerTurn.currentPlayer.takeMoney(Square.dev2rent);
			PlayerTurn.PlayerTurnOptions();
			if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

				GameEnd.GameLose();

			}
		} else {
			System.out.println("TeamWork at its finest!");
			PlayerTurn.PlayerTurnOptions();
		}

	}

	@Override
	public void acceptRentLvl3Option() {
		System.out
				.println("You arrived at " + PlayerTurn.otherPlayer.getPlayerName() + "' element and as a result owe a "
						+ Square.dev3rent + "LC Reimbursement for the resources used while at this element");
		System.out.println(
				"Does " + PlayerTurn.otherPlayer.getPlayerName() + " wish to accept the Reimbursement? (Y/N) ");
		acceptRentOption = scan.next();
		// if the other player wishes to accept the rent
		if ((acceptRentOption.equalsIgnoreCase("Y")
				&& (PlayerTurn.currentPlayer.getPlayerBalance() - Square.dev3rent > 0))) {
			PlayerTurn.currentPlayer.takeMoney(Square.dev3rent);
			rentPayment();
			PlayerTurn.PlayerTurnOptions();
			if (PlayerTurn.currentPlayer.getPlayerBalance() <= 0) {

				GameEnd.GameLose();

			}
		} else {
			System.out.println("TeamWork at its finest!");
			PlayerTurn.PlayerTurnOptions();
		}

	}



	public void upgradeElementOptions() {
		String upgradeElementOption;
		for (Square fullyDev : PlayerTurn.currentPlayer.playerOwned) {

			System.out.println("Would you Like to Upgrade: " + fullyDev.getSquareName() + "(Y/N)");
			upgradeElementOption = scan.next();
			if (upgradeElementOption.equalsIgnoreCase("y")) {
				// if dev1 isn't developed && player can afford to develop
				if ((!fullyDev.isDev1())
						&& (PlayerTurn.currentPlayer.getPlayerBalance() - fullyDev.getDev1rent() > 0)) {

					PlayerTurn.currentPlayer.takeMoney(fullyDev.getDev1rent());
					if (PlayerTurn.currentPlayer.getPlayerBalance() - fullyDev.getDev1rent() < 0) {

						GameEnd.GameLose();
					} else {// ---------------------DEV 1----------------------
						System.out.println(PlayerTurn.currentPlayer.getPlayerName() + " has Upgraded "
								+ fullyDev.getSquareName() + " to LEVEL 1 for:" + fullyDev.getDev1rent() + "LC");
						System.out.println(PlayerTurn.currentPlayer.getPlayerName() + "'s new Credit Balance is: "
								+ PlayerTurn.currentPlayer.getPlayerBalance() + "LC");
						fullyDev.setDev1(true);

					}
				} else if ((!fullyDev.isDev2())
						&& (PlayerTurn.currentPlayer.getPlayerBalance() - fullyDev.getDev2rent() > 0)) {

					PlayerTurn.currentPlayer.takeMoney(fullyDev.getDev2rent());
					if (PlayerTurn.currentPlayer.getPlayerBalance() - fullyDev.getDev2rent() < 0) {

						GameEnd.GameLose();
					} else {// ---------------------DEV 1----------------------
						System.out.println(PlayerTurn.currentPlayer.getPlayerName() + " has Upgraded "
								+ fullyDev.getSquareName() + " to LEVEL 2 for:" + fullyDev.getDev2rent() + "LC");
						System.out.println(PlayerTurn.currentPlayer.getPlayerName() + "'s new Credit Balance is: "
								+ PlayerTurn.currentPlayer.getPlayerBalance() + "LC");
						fullyDev.setDev2(true);

					}
				} else if ((!fullyDev.isDev3())
						&& (PlayerTurn.currentPlayer.getPlayerBalance() - fullyDev.getDev3rent() > 0)) {

					PlayerTurn.currentPlayer.takeMoney(fullyDev.getDev3rent());
					if (PlayerTurn.currentPlayer.getPlayerBalance() - fullyDev.getDev3rent() < 0) {

						GameEnd.GameLose();
					} else {// ---------------------DEV 1----------------------
						System.out.println(PlayerTurn.currentPlayer.getPlayerName() + " has Upgraded "
								+ fullyDev.getSquareName() + " to LEVEL 3 for:" + fullyDev.getDev3rent() + "LC");
						System.out.println(PlayerTurn.currentPlayer.getPlayerName() + "'s new Credit Balance is: "
								+ PlayerTurn.currentPlayer.getPlayerBalance() + "LC");
						fullyDev.setDev3(true);
						PlayerTurn.currentPlayer.fullyDevelopedElements.add(fullyDev);

						if (fullyDev.isDev3()) {
							System.out.println(fullyDev.getSquareName() + " is Fully Upgraded");

						}

					}
				} else {
					System.out.println(fullyDev.getSquareName() + " is Fully Upgraded");
					
				}
			} else if ((!upgradeElementOption.equalsIgnoreCase("y")
					&& (PlayerTurn.currentPlayer.playerOwned.isEmpty()))) {
				PlayerTurn.PlayerTurnOptions();

			}
		}
	}

	@Override
	public void rentPayment() {
		System.out.println(PlayerTurn.currentPlayer.getPlayerName() + "'s Credit Balance is now :"
				+ PlayerTurn.currentPlayer.getPlayerBalance());
		System.out.println(PlayerTurn.otherPlayer.getPlayerName() + "'s Credit Balance is now :"
				+ PlayerTurn.otherPlayer.getPlayerBalance());
		System.out.println();

	}

}

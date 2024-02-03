/**
 * 
 */
package classes;

/**
 * OOP solution for game board squares
 * 
 * @author colmmckenna & RoryMcManus
 *
 */
public class Square {

	// instance vars
	private int squareNumber;
	private String systemName;
	private String squareName;
	private int systemNum;
	private int cost;
	public static int dev0rent;
	public static int dev1rent;
	public static int dev2rent;
	public static int dev3rent;

	private boolean isOwned;
	private boolean canBeOwned;
	private boolean isDev1 = false;
	private boolean isDev2 = false;
	private boolean isDev3 = false;

	/**
	 * default constructor
	 */
	public Square() {

	}

	/**
	 * constructor with args
	 * 
	 * @param squareNumber
	 * @param systemName
	 * @param squareName
	 */

	/*
	 * get square number
	 */
	public int getSquareNumber() {
		return squareNumber;
	}

	public Square(int squareNumber, String systemName, String squareName, int cost,
			int dev0rent, int dev1rent, int dev2rent, int dev3rent, boolean isOwned, boolean isDev1, boolean isDev2, boolean isDev3, int systemNum) {

		this.squareNumber = squareNumber;
		this.systemName = systemName;
		this.squareName = squareName;
		this.cost = cost;
		Square.dev0rent = dev0rent;
		Square.dev1rent = dev1rent;
		Square.dev2rent = dev2rent;
		Square.dev3rent = dev3rent;
		this.isOwned = isOwned;
		this.isDev1 = isDev1;
		this.isDev2 = isDev2;
		this.isDev3 = isDev3;
		this.systemNum=systemNum;
	}

	public Square(int squareNumber, String systemName, String squareName,
			boolean canBeOwned) {

		this.squareNumber = squareNumber;
		this.systemName = systemName;
		this.squareName = squareName;
		this.canBeOwned = canBeOwned;
	}

	/*
	 * set square number
	 */
	public void setSquareNumber(int squareNumber) {
		this.squareNumber = squareNumber;
	}

	/*
	 * get system development name
	 */
	public String getSystemName() {
		return systemName;
	}

	/*
	 * set system development name
	 */
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	/*
	 * get square name
	 */
	public String getSquareName() {
		return squareName;
	}

	/*
	 * set square name
	 */
	public void setSquareName(String squareName) {
		this.squareName = squareName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDev0rent() {
		return dev0rent;
	}

	public  void setDev0rent(int dev0rent) {
		Square.dev0rent = dev0rent;
	}

	public int getDev1rent() {
		return dev1rent;
	}

	public void setDev1rent(int dev1rent) {
		Square.dev1rent = dev1rent;
	}

	public int getDev2rent() {
		return dev2rent;
	}

	public void setDev2rent(int dev2rent) {
		Square.dev2rent = dev2rent;
	}

	public int getDev3rent() {
		return dev3rent;
	}

	public void setDev3rent(int dev3rent) {
		Square.dev3rent = dev3rent;
	}



	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	public boolean CanBeOwned() {
		return canBeOwned;
	}

	public void setCanBeOwned(boolean canBeOwned) {
		this.canBeOwned = canBeOwned;
	}

	public boolean isDev1() {
		return isDev1;
	}

	public void setDev1(boolean isDev1) {
		this.isDev1 = isDev1;
	}

	public boolean isDev2() {
		return isDev2;
	}

	public void setDev2(boolean isDev2) {
		this.isDev2 = isDev2;
	}

	public boolean isDev3() {
		return isDev3;
	}

	public void setDev3(boolean isDev3) {
		this.isDev3 = isDev3;
	}

	public int getSystemNum() {
		return systemNum;
	}

	public void setSystemNum(int systemNum) {
		this.systemNum = systemNum;
	}
	

}

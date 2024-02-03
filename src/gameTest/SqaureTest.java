package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Square;

class SqaureTest {
	
		// test data
		int squareNumber;
		String systemName;
		String squareName;
		int systemNum;
		int cost;
		int dev0rent;
		int dev1rent;
		int dev2rent;
		int dev3rent;

		boolean isOwned;
		boolean canBeOwned;
		boolean isDev1;
		boolean isDev2;
		boolean isDev3;
	
	Square sq1;

	@BeforeEach
	void setUp() throws Exception {
		
		squareNumber = 1;
		cost = 100;
		dev0rent = 10;
		dev1rent = 10;
		dev2rent = 10;
		dev3rent = 10;
		isOwned = true;
		canBeOwned = true;
		isDev1 = false;
		isDev2 = false;
		isDev3 = false;
		
	}
	

	@Test
	void testDefautltConst() {
		
		sq1 = new Square();
		
		assertNotNull(sq1);
	}
	
	
	
	@Test
	void testValidConstructor(){
		
		sq1 = new Square(squareNumber,  systemName,  squareName,  cost,
				 dev0rent,  dev1rent,  dev2rent,  dev3rent,  isOwned,  isDev1,  isDev2,  isDev3,  systemNum);
		
		assertEquals(squareNumber, sq1.getSquareNumber());
		assertEquals(systemName, sq1.getSystemName());
		assertEquals(squareName, sq1.getSquareName());
		assertEquals(cost, sq1.getCost());
		assertEquals(dev0rent, sq1.getDev0rent());
		assertEquals(dev1rent, sq1.getDev1rent());
		assertEquals(dev2rent, sq1.getDev2rent());
		assertEquals(dev3rent, sq1.getDev3rent());
		assertEquals(isOwned, true);
		assertEquals(canBeOwned, true);
		assertEquals(isDev1, false);
		assertEquals(isDev2, false);
		assertEquals(isDev3, false);
	}
	

	@Test
	void testGetSetSquareNumber() {
		
		sq1 = new Square();
		sq1.setSquareNumber(squareNumber);
		assertEquals(squareNumber, sq1.getSquareNumber());
	}
	
	@Test
	void testGetSetCost() {
		
		sq1 = new Square();
		sq1.setCost(cost);
		assertEquals(cost, sq1.getCost());
	}
	
	@Test
	void testGetSetDevRent() {
		
		sq1 = new Square();
		
		sq1.setDev0rent(dev0rent);
		assertEquals(dev0rent, sq1.getDev0rent());
		
		sq1.setDev1rent(dev1rent);
		assertEquals(dev1rent, sq1.getDev1rent());
		
		sq1.setDev2rent(dev2rent);
		assertEquals(dev2rent, sq1.getDev2rent());
		
		sq1.setDev3rent(dev3rent);
		assertEquals(dev3rent, sq1.getDev3rent());
	}
	

	
	@Test
	void testGetSetIsOwned() {
		
		sq1 = new Square();
		
		sq1.setOwned(isOwned);
		assertEquals(isOwned, true);
	}
	
	@Test
	void testGetSetCanBeOwned() {
		
		sq1 = new Square();
		
		sq1.setCanBeOwned(canBeOwned);
		assertEquals(canBeOwned, true);
	}
	
	@Test
	void Development() {
		
		sq1 = new Square();
		
		sq1.setDev1(isDev1);
		assertEquals(isDev1, false);
		
		sq1.setDev2(isDev2);
		assertEquals(isDev2, false);
		
		sq1.setDev3(isDev3);
		assertEquals(isDev3, false);
		
	}

}










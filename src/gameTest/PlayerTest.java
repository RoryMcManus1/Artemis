package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Player;
import classes.Square;

class PlayerTest {
	
	//test data
	int playerIDValidLow;
	int playerIDValidHigh;
	int playerIDInvalidLow;
	int playerIDInvalidHigh;
	String playerNameValidLength;
	String playerNameInvalidLengthLow;
	String playerNameInvalidLengthHigh;
	String playerNameInvalidNull;
	int playerBalanceValidLow;
	int playerBalanceValidHigh;
	int playerBalanceInvalid;
	int currentPositionValid;
	int currentPositionInvalid;
	boolean isTurn;
	ArrayList<Square> playerOwned;
	ArrayList<Square> fullyDevelopedElements;
	
	Player player1;
	

	@BeforeEach
	void setUp() throws Exception {
		
		playerIDValidLow = 1;
		playerIDValidHigh = 4;
		playerIDInvalidLow = 0;
		playerIDInvalidHigh = 5;
		
		playerNameValidLength = "AAA";
		playerNameInvalidLengthLow = "A";
		playerNameInvalidLengthHigh = "AAAAAAAAAAA";
		playerNameInvalidNull = null;
		
		playerBalanceValidLow = 1;
		playerBalanceValidHigh = 550;
		playerBalanceInvalid = -1;
		 
		currentPositionValid = 2;
		currentPositionInvalid = 0;
		
		isTurn = true;
		
		
	}

	@Test
	void testDefaultConst() {
		
	}
	
	@Test
	void testValidConstructor() {
	
		player1 = new Player(playerIDValidLow, playerNameValidLength, playerBalanceValidLow, currentPositionValid);
		
		assertEquals(playerIDValidLow, player1.getPlayerID());
		assertEquals(playerNameValidLength, player1.getPlayerName());
		assertEquals(playerBalanceValidLow, player1.getPlayerBalance());
		assertEquals(currentPositionValid, player1.getCurrentPosition());
	}
	
	
	/*
	@Test
	void testInvalidConstructorArgs() {
		
		// attempt to set with invalid ID
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> { 
			Player player = new Player(playerIDInvalidLow, playerNameValidLength, playerBalanceValidLow, currentPositionValid); 
			} 
		);
		
		// attempt to set with invalid Name
		illegalArgumentException  = assertThrows(IllegalArgumentException.class, () -> { 
			Player player = new Player(playerIDValidLow, playerNameInvalidLengthHigh, playerBalanceValidLow, currentPositionValid); 
			} 
		);
		
		// attempt to set with invalid Balance
		illegalArgumentException  = assertThrows(IllegalArgumentException.class, () -> { 
			Player player = new Player(playerIDValidLow, playerNameValidLength, playerBalanceInvalid, currentPositionValid); 
			} 
		);
		
		// attempt to set with invalid Position
		illegalArgumentException  = assertThrows(IllegalArgumentException.class, () -> { 
			Player player = new Player(playerIDValidLow, playerNameValidLength, playerBalanceValidLow, currentPositionInvalid); 
			} 
		);
		
	}
	*/

	
	@Test 
	void getSetPlayerID(){
		
		player1 = new Player();
		
		//valid low value
		player1.setPlayerID(playerIDValidLow);
		assertEquals(playerIDValidLow, player1.getPlayerID());
		
		//valid high value
		player1.setPlayerID(playerIDValidHigh);
		assertEquals(playerIDValidHigh, player1.getPlayerID());
		
	}
	
	@Test 
	void getSetPlayerIDInvalid(){
		
		player1 = new Player();
		
		//invalid low value
		player1.setPlayerID(playerIDInvalidLow);
		assertEquals(playerIDInvalidLow, player1.getPlayerID());
		
		//invalid high value
		player1.setPlayerID(playerIDInvalidHigh);
		assertEquals(playerIDInvalidHigh, player1.getPlayerID());
	}
	
	@Test 
	void getSetPlayerName(){
		
		player1 = new Player();
		
		//valid name
		player1.setPlayerName(playerNameValidLength);
		assertEquals(playerNameValidLength, player1.getPlayerName());
		
	}
	
	
	@Test 
	void getSetPlayerNameInvalid(){
		
		player1 = new Player();
		
		
		//invalid name length low
		player1.setPlayerName(playerNameInvalidLengthLow);
		assertEquals(playerNameInvalidLengthLow, player1.getPlayerName());
		
		
		//invalid name length low
		player1.setPlayerName(playerNameInvalidLengthHigh);
		assertEquals(playerNameInvalidLengthHigh, player1.getPlayerName());
		
		
		player1.setPlayerName(playerNameInvalidNull);
		assertNotNull(playerNameInvalidNull);
	
	}
	
	
	@Test 
	void getSetPlayerBalance(){
		
		player1 = new Player();
		
		//valid balance low
		player1.setPlayerBalance(playerBalanceValidLow);
		assertEquals(playerBalanceValidLow, player1.getPlayerBalance());
		
		//valid balance high
		player1.setPlayerBalance(playerBalanceValidHigh);
		assertEquals(playerBalanceValidHigh, player1.getPlayerBalance());
		
	}
	
	@Test 
	void getSetPlayerBalanceInvalid(){
		
		player1 = new Player();
		//invalid balance
		player1.setPlayerBalance(playerBalanceInvalid);
		assertEquals(playerBalanceInvalid, player1.getPlayerBalance());
	}
	
	@Test 
	void getSetPlayerPosition(){
		
		player1 = new Player();
		
	player1.setCurrentPosition(currentPositionValid);
	assertEquals(currentPositionValid, player1.getCurrentPosition());
		
	}
	
	@Test 
	void testPlayerOwnedList(){
		
		Square sq1 = new Square();
		Square sq2 = new Square();

		playerOwned = new ArrayList<Square>();
		
		playerOwned.add(sq1);
		playerOwned.add(sq2);
		
		assertTrue(playerOwned.contains(sq1) && playerOwned.contains(sq2));
		
		
	}
	
	@Test
	void testAddTakePlayerMoney() {
		
		player1 = new Player();
		int amount = 10;
		
		player1.setPlayerBalance(playerBalanceValidHigh);
		player1.addMoney(amount);
		assertEquals(playerBalanceValidHigh + amount, player1.getPlayerBalance());
		
		player1.setPlayerBalance(playerBalanceValidLow);
		player1.takeMoney(amount);
		assertEquals(playerBalanceValidLow - amount, player1.getPlayerBalance());
		
	}
	
	@Test
	void testAddRemovePlayerAssets() {
		
		player1 = new Player();
		playerOwned = new ArrayList<Square>();
		Square sq1 = new Square();

		player1.addPlayerAssets(sq1);
		assertTrue(playerOwned.contains(sq1));
		
		player1.removePlayerAssets(sq1);
		assertFalse(playerOwned.contains(sq1));
		
	}
	
	@Test
	void testAddFullyDevelopedElements() {
		
		player1 = new Player();
		fullyDevelopedElements = new ArrayList<Square>();
		Square sq1 = new Square();
		
		player1.addFullDevAssets(sq1);
		assertTrue(fullyDevelopedElements.contains(sq1));
	}

}







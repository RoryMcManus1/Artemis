package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.GameSystems;

/*
 * test class for Game System object
 * 
 */
class GameSystemTest {
	
	String name;
	int elementsInSystem;
	int systemNum;
	int systemDevelopmentCost;
	boolean systemFullyDeveloped;
	GameSystems sys1;
	

	@BeforeEach
	void setUp() throws Exception {
		
		name = "AA";
		elementsInSystem = 2;
		systemNum = 1;
		systemDevelopmentCost = 100;
		systemFullyDeveloped = false;
	}

	
	@Test
	void testDefaultCons() {
		
		sys1 = new GameSystems();
		assertNotNull(sys1);
	}
	
	@Test
	void testValidConstructor() {
		
		sys1 = new GameSystems(name,  elementsInSystem, systemFullyDeveloped, 
							   systemNum, systemDevelopmentCost);
		
		
		assertEquals(name, GameSystems.getName());
		assertEquals(elementsInSystem, GameSystems.getElementsInSystem());
		assertEquals(systemFullyDeveloped, sys1.isSystemFullyDeveloped());
		assertEquals(systemNum, GameSystems.getSystemNum());
		assertEquals(systemDevelopmentCost, GameSystems.getSystemDevelopmentCost());
		
	}
	
	/*
	@Test 
	void testInvalidConstructor() {
		
	}
	*/
	
	@Test
	void testGetSetName() {
		
		sys1 = new GameSystems();
		
		sys1.setName(name);
		assertEquals(name, GameSystems.getName());
	}
	
	
	@Test 
	void testGetSetElementsInSystem() {
		
		sys1 = new GameSystems();
		
		sys1.setElementsInSystem(elementsInSystem);
		assertEquals(elementsInSystem, GameSystems.getElementsInSystem());
	}
	
	@Test
	void testSystemNum() {
		
		sys1 = new GameSystems();
		
		sys1.setSystemNum(systemNum);
		assertEquals(systemNum, GameSystems.getSystemNum());
	}
	
	@Test
	void testSystemDevelopmentCost() {
		
		sys1 = new GameSystems();
		
		GameSystems.setSystemDevelopmentCost(systemDevelopmentCost);
		assertEquals(systemDevelopmentCost, GameSystems.getSystemDevelopmentCost());
	}
	
	@Test
	void testSystemDeveloped() {
		
		sys1 = new GameSystems();
		
		GameSystems.setSystemFullyDeveloped(true);
		assertTrue(sys1.isSystemFullyDeveloped());
		
		GameSystems.setSystemFullyDeveloped(false);
		assertFalse(sys1.isSystemFullyDeveloped());
	}

}






/**
 * 
 */
package classes;

/**
 * @author PC
 *
 */
public class GameSystems {
	private static String name;
	public static int elementsInSystem;
	public static boolean systemFullyDeveloped = false;
	public static int systemNum;
	public static int systemDevelopmentCost;

	public GameSystems() {

	}

	public GameSystems(String name, int elementsInSystem, boolean systemFullyDeveloped, int systemNum, int systemDevelopmentCost) {

		GameSystems.name = name;
		GameSystems.elementsInSystem = elementsInSystem;
		GameSystems.systemFullyDeveloped = systemFullyDeveloped;
		GameSystems.systemNum=systemNum;
		GameSystems.systemDevelopmentCost =systemDevelopmentCost;
	}

	public static String getName() {
		return name;
	}

	public  void setName(String name) {
		GameSystems.name = name;
	}

	public static int getElementsInSystem() {
		return elementsInSystem;
	}

	public void setElementsInSystem(int elementsInSystem) {
		GameSystems.elementsInSystem = elementsInSystem;
	}

	public boolean isSystemFullyDeveloped() {
		return systemFullyDeveloped;
	}

	public static void setSystemFullyDeveloped(boolean systemFullyDeveloped) {
		GameSystems.systemFullyDeveloped = systemFullyDeveloped;
		
	}

	public static int getSystemNum() {
		return systemNum;
	}

	public void setSystemNum(int systemNum) {
		GameSystems.systemNum = systemNum;
	}

	public static int getSystemDevelopmentCost() {
		return systemDevelopmentCost;
	}

	public static void setSystemDevelopmentCost(int systemDevelopmentCost) {
		GameSystems.systemDevelopmentCost = systemDevelopmentCost;
	}
	

}

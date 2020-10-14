package vendormachine;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import vendormachine.users.Person;
import vendormachine.vendors.DefaultSnacks;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.enums.BRANDS;
import vendormachine.vendors.item.Snack;

public class DrinkVendingMachineTEST {
	
	/** 
	 * Task 2:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.vendors.DrinkVendingMachine'
	 * 
	 * 	Goal: 
	 * 		80% code/line coverage
	 * 		TDD: analyse code and add missing methods.
	 * */
	
	//Resources
	private BRANDS brandName1 = null;
	private ArrayList<Snack> drinkList = new ArrayList<Snack>();
	
	//Keep track of tests
	private static int activeTest = 1;
	private static StringBuilder sBuilder = new StringBuilder();
	private static String div = "=============================================\n";
	
	
	@Before
	public void init() {
				
		//Populate Array + values for brands
		this.drinkList.addAll(Arrays.asList(DefaultSnacks.snackList));
		// Start of console test format
		sBuilder.setLength(0);
		sBuilder
		.append("\tTest ").append(activeTest).append("\n")
		.append(div)
		.append("Console:");
				
		System.out.println(sBuilder.toString());
		activeTest++;
		// End of console test format
	}
	
	@Test
	public void populateDrinkListTest() {
		DrinkVendingMachine voidConstructor = new DrinkVendingMachine();
		
		System.out.println(drinkList);
		assertTrue(voidConstructor instanceof DrinkVendingMachine);
	}
	
	@Test 
	public void constructorTest() {
		DrinkVendingMachine drinkVending = new DrinkVendingMachine(0.5f, brandName1);
		assertTrue(drinkVending instanceof DrinkVendingMachine);
	}
	
	@Test 
	public void selectDrinkTest1() {
		int arrayPosition = 1;
		
		DrinkVendingMachine drinkVending = new DrinkVendingMachine(10f, brandName1);
		Snack selection = drinkVending.selectDrink(arrayPosition);
		assertNotNull(selection);
	}
	
	@Test 
	public void selectDrinkTest() {
		int arrayPosition = 0;
		
		DrinkVendingMachine drinkVending = new DrinkVendingMachine(10f, brandName1);
		Snack selection = drinkVending.selectDrink(arrayPosition);
		assertNotNull(selection);
	}
	
	
	
	@After
	public void afterTest() {
		System.out.println(div);
	}
	
	
}

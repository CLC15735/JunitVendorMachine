package vendormachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.
	
	//Resources
	private float storeCredit = 0.5f;
	
	//Keep track of tests
	private static int activeTest = 1;
	private static StringBuilder sBuilder = new StringBuilder();
	private static String div = "=============================================\n";
	
	@Before
	public void init() {
				
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
	public void constructorTest() {
		//Constructor 1
		Wallet allanWallet = new Wallet(0.5f); 
		assertTrue(allanWallet instanceof Wallet);
		
		//Constructor 2
		allanWallet = new Wallet("Generic", 0.5f);
		assertTrue(allanWallet instanceof Wallet);
	}
	
	
	@Test
	public void getAllSetCreditTest() {
		Wallet allanWallet = new Wallet(0.5f);
		allanWallet.setCredit(10f);
		assertEquals(10f, allanWallet.getAllCredit(), 0.00002f);
	}
	
	@Test
	public void getSetBrandTest() {
		Wallet allanWallet = new Wallet(0.5f);
		String band = "Something";
		allanWallet.setBrand(band);
		assertEquals(band, allanWallet.getBrand(band));
	}
	
	@Test
	public void addCreditTest() {
		Wallet allanWallet = new Wallet(0.5f);
		allanWallet.addCredit(10f);
		assertEquals(10.5f, allanWallet.getAllCredit(), 0.00002f);
	}
	
	@Test
	public void getCreditTest() {
		Wallet allanWallet = new Wallet(10f);
		float result = allanWallet.getCredit(5f);
		
		assertEquals(5f, result, 0.00002f);		
	}
	
	@Test 
	public void notEnoughCreditTest() {
		Wallet allanWallet = new Wallet(0.5f);	
		float result = allanWallet.getCredit(5f);
		
		assertEquals(0f, result, 0.00002f);
	}
	
	@After
	public void afterTest() {
		System.out.println(div);
	}
	
}

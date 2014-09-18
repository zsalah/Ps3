package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account c;
	
	Account ID = new Account(1122, 0, 0);
	
	Account Balance = new Account(20000, 0, 0);
	
	Account AnnualInterestrate = new Account(0, 0, 4.5);
	
	
	

	@Before
	public void setUp() throws Exception {
		c = new Account(101, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public final void testWithdraw() throws InsufficientFundsException {
		int x = 0;

		while (x < 20) {
			c.withdraw(3000);
		}
		
	}
	
}
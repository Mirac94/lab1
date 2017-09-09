package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		int underTwo=0;
		int overTwelve=0;
		
		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			
			/*The block of code below makes sure every roll is
			 * between the expected values of 2 and 12, inclusive.
			 */
			if (r.getScore() < 2)
				underTwo++;
			else if (r.getScore() > 12)
				overTwelve++;
		}
		
		System.out.println("Rolls under 2: "+underTwo+"\nRolls over 12: "+overTwelve);
		

	}

}

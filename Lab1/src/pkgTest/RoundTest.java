package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;
import pkgCore.Round;
import pkgCore.eGameResult;

import java.util.LinkedList;

public class RoundTest {

	@Test
	public void test() {
		for (int a = 0; a < 10000; a++) {
			Round round = new Round();
			
			
			/*CRAPS and NATURAL game results have to have only 1 roll.
			 * POINT and SEVEN_OUT game results have to have more than 1 roll.
			 */
			assertTrue((round.RollCount() == 1 && round.geteGameResult()==eGameResult.NATURAL)||
					(round.RollCount() == 1 && round.geteGameResult()==eGameResult.CRAPS)||
					(round.RollCount() > 1 && round.geteGameResult()==eGameResult.POINT)||
					(round.RollCount() > 1 && round.geteGameResult()==eGameResult.SEVEN_OUT));
		}
	}

}

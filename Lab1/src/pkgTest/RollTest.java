package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;
import java.util.LinkedList;
public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			
			assertTrue((r.getScore()>=2) && (r.getScore()<=12));
		}
	
	}

}

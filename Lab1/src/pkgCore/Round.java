package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		Roll rollInstance = new Roll();
		boolean rollPass = true;

		rolls.add(rollInstance);
		ComeOutScore = rollInstance.getScore();
		
		switch (ComeOutScore) {
			case 7: case 11:
				eGameResult = eGameResult.NATURAL;
				rollPass = false;
				break;
			case 2: case 3: case 12:
				eGameResult = eGameResult.CRAPS;
				rollPass = false;
				break;
		}
		
		/* While loop runs until there is a 7 or "point" dice roll.
		 * The value of the "point" is stored in ComeOutScore.
		 * If rollPass is still true, then the initial roll was not a natural or craps.
		 * rollPass must be true in order for the loop to execute at all.
		 */
		while (rollPass) {
			rollInstance = new Roll();
			int roll = rollInstance.getScore();
			
			rolls.add(rollInstance);
			
			//if-else block checks for point or seven out and then stops while loop.
			if (roll == ComeOutScore) {
				rollPass = false;
				eGameResult = eGameResult.POINT;
				}
			else if (roll == 7) {
				rollPass = false;
				eGameResult = eGameResult.SEVEN_OUT;
				}
			}
		}


	public int RollCount() {
		return rolls.size();
	}

	public eGameResult geteGameResult() {
		return eGameResult;
	}

}

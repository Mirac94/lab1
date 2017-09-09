package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {
		
		int countOnes=0;
		int countTwos=0;
		int countThrees=0;
		int countFours=0;
		int countFives=0;
		int countSixes=0;
		
		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			
			/*The block of code below counts the number of each outcome
			 * to make sure there's an even probability distribution.
			 * Simply, counting whenever the DieValue is below or above
			 * 1 and 6, respectively, doesn't say anything about how "fair" the die is.
			*/
			if (d.getDieValue()==1)
				countOnes++;
			else if(d.getDieValue()==2)
				countTwos++;
			else if(d.getDieValue()==3)
				countThrees++;
			else if(d.getDieValue()==4)
				countFours++;
			else if(d.getDieValue()==5)
				countFives++;
			else if(d.getDieValue()==6)
				countSixes++;
		}
		/*total finds the sum of the expected outcomes, so that we can determine
		 * if all the roll outcomes are within expectation
		*/
		int total=countOnes+countTwos+countThrees+countFours+countFives+countSixes;
		
		System.out.println("1:"+countOnes+"\n2:"+countTwos+"\n3:"+countThrees+"\n4:"+countFours+"\n5:"+countFives+"\n6:"+countSixes+"\nTotal:"+total);
	}

}

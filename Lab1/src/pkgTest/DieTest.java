package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {
		int countOnes=0,countTwos=0,countThrees=0,countFours=0,countFives=0,countSixes=0;
		
		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			System.out.println(d.getDieValue());
			
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
		int total=countOnes+countTwos+countThrees+countFours+countFives+countSixes;
		System.out.println("1:"+countOnes+"\n2:"+countTwos+"\n3:"+countThrees+"\n4:"+countFours+"\n5:"+countFives+"\n6:"+countSixes+"\nTotal:"+total);
	}

}

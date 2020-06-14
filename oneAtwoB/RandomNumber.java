package oneAtwoB;

import java.util.Random;

public class RandomNumber {
	
	int[] getRandomNumber() {
		int n = 10;
		Random rand = new Random();
		boolean[] bool = new boolean[n];

		int[] randlist = new int[4];

		for(int i = 0; i < 4 ; i++) {

			do {

				randlist[i] = rand.nextInt(n);

			}while(bool[randlist[i]]);

			bool[randlist[i]] = true;

			//System.out.print(randlist[i]);
		}
	
		//System.out.println();
		return randlist;
	}
	
}

package oneAtwoB;

import java.util.*;

public class oneAtwoB {

	static Scanner in = new Scanner(System.in);
	static RandomNumber RandNum = new RandomNumber();
	static listnumber listnumbers = new listnumber();
	static chack chackroid = new chack();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] listans = RandNum.getRandomNumber();
		getchack(listans);
	}
	
	static void getchack(int[] listans) {
		
		System.out.println("請輸入四個數字：");
		int get = in.nextInt();
		
		int[] listnumber = listnumbers.getlistnumberr(get);

		chackroid.chack(listans, listnumber);
		
	}

}

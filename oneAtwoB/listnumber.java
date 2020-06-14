package oneAtwoB;

public class listnumber {
	
	int[] getlistnumberr(int get) {

		int[] listnumber = new int[4];
		
		listnumber[0] = get/1000;  
		listnumber[1] = get/100%10;
		listnumber[2] = get/10%10;
		listnumber[3] = get%10;
	
		return listnumber;		
	}

}

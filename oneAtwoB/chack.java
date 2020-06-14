package oneAtwoB;

public class chack {
	
	private oneAtwoB gofist = new oneAtwoB();
	
	void chack(int[]listans, int[] listnumber) {
		int a =0, b = 0;
		for(int i = 0; i < listans.length; i++) {
			if(listans[i] == listnumber[i]) {
				a++;
			}
			for(int j = 0; j < listnumber.length; j++) {
				if(listans[i] == listnumber[j]) {
					b++;
				}				
			}
		}
		
		if(a > 0) {
			b = b - a;
		}
		
		System.out.println(a+"A"+b+"B");
		
		if(a == 4) {
			System.out.println("過關");
		}else {
			System.out.println("未過關喔");
			oneAtwoB.getchack(listans);
		}
		
	}

}


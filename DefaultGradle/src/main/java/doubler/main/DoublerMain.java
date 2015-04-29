package doubler.main;

import doubler.Doubler;
import doubler.impl.DoublerImpl;

public class DoublerMain {

	public static void main(String[] args) {
		
		Doubler doub = new DoublerImpl();
		System.out.println(350 + " doubled is " + doub.doubleIt(350));

	}

}

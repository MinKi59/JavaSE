package section12;

import section12.access2.Cat;
import section12.access2.HouseCat;
import section12.access2.PersianCat;
import section12.access2.Playable;

public class InterfaceClass01 {
	public static void main(String[] args) {
		
		// Cat.PAW = 3;
		
		Cat cat1 = new HouseCat();
		eat(cat1);
		
		HouseCat hCat = (HouseCat) cat1;
		hCat.play();
		
		Playable pCat = hCat;
		pCat.play();
	}
	
	public static void eat(Cat cat) {
		cat.eat();
	}
}

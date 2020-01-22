public class SimpleAppetizerFactory {

	public Appetizer createAppetizer(String type) {
		Appetizer appetizer = null;

		if (type.equals("House Salad")) {
			appetizer = new HouseSalad();
		} else if (type.equals("Calamari Fritte")) {
			appetizer = new Calamari();
		} else if (type.equals("Mozzarella Sticks")) {
			appetizer = new MozzarellaSticks();
		} else if (type.equals("Caprese Skewers")) {
			appetizer = new CapreseSkewers();
		} else if (type.equals("Stuffed Mushrooms")) {
			appetizer = new StuffedMushrooms();
		}		
		return appetizer;
	}
}
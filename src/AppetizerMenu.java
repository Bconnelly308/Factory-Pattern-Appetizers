public class AppetizerMenu {
	SimpleAppetizerFactory factory;
 
	public AppetizerMenu(SimpleAppetizerFactory factory) { 
		this.factory = factory;
	}
 
	public Appetizer orderAppetizer(String type) {
		Appetizer appetizer;
 
		appetizer = factory.createAppetizer(type);
 
		appetizer.prepare();
		appetizer.cook();
		appetizer.plate();
		appetizer.serve();

		return appetizer;
	}
}
public class Order {
 
	public static void main(String[] args) {
		SimpleAppetizerFactory factory = new SimpleAppetizerFactory();
		AppetizerMenu store = new AppetizerMenu(factory);

		Appetizer appetizer = store.orderAppetizer("House Salad");
		System.out.println("Dish: " + appetizer.getName() + " was ordered" + "\n");
		System.out.println(appetizer);
 
		appetizer = store.orderAppetizer("Calamari Fritte");
		System.out.println("Dish: " + appetizer.getName() + " was ordered" + "\n");
		System.out.println(appetizer);
		
		appetizer = store.orderAppetizer("Mozzarella Sticks");
		System.out.println("Dish: " + appetizer.getName() + " was ordered" + "\n");
		System.out.println(appetizer);
		
		appetizer = store.orderAppetizer("Caprese Skewers");
		System.out.println("Dish: " + appetizer.getName() + " was ordered" + "\n");
		System.out.println(appetizer);
		
		appetizer = store.orderAppetizer("Stuffed Mushrooms");
		System.out.println("Dish: " + appetizer.getName() + " was ordered" + "\n");
		System.out.println(appetizer);
	}
}
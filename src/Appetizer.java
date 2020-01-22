import java.util.ArrayList;

abstract public class Appetizer {
	String name;
	int calories;
	double cost;
	ArrayList<String> ingredients = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void cook() {
		System.out.println("Cooking " + name);
	}

	public void plate() {
		System.out.println("Plating " + name);
	}

	public void serve() {
		System.out.println("Serving " + name);
	}

	public String toString() {
		// code to display appetizer name, cost, calories, and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append("Cals: " + calories + "\n");
		display.append("$" + cost + "\n");
		for (String ingredients : ingredients) {
			display.append(ingredients + "\n");
		}
		return display.toString();
	}
}
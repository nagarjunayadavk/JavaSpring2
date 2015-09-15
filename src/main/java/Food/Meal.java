package Food;

public class Meal {

	private Fruit fruit;
	private Rice rice;
	
	public Meal() {}
	
	public Meal(Fruit f,Rice r){
		this.fruit = f;
		this.rice = r;
	}
	
	public String mealContains() {
		String meal = "This is meal pack contains :: ";
		if(fruit != null) meal +="  Fruit";
		if(rice != null) meal +="   Rice";
		
		return meal;
	}
}

package Food;

public class MealPack {

	private Fruit fruit;
	private Rice rice;
	
	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public Rice getRice() {
		return rice;
	}

	public void setRice(Rice rice) {
		this.rice = rice;
	}
	
	public String currentMeal() {
		String meal = "This is meal pack contains :: ";
		if(fruit != null) meal +="  Fruit";
		if(rice != null) meal +="   Rice";
		
		return meal;
	}

}

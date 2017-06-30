public class Main{

	public static void main(String args[]){
		Meal meal = new Meal();
		meal.addItem(new VegBurger(new PlasticWrapper()));
		meal.addItem(new ChickenBurger(new PlasticWrapper()));
		meal.addItem(new Pepsi(new GlassBottle()));
		meal.addItem(new Coke(new PlasticBottle()));
		meal.displayMeal();
	}
}

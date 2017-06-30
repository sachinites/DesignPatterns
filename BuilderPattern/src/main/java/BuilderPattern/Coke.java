public class Coke extends Beverage{

	Bottle bot;
	Coke(Bottle bot){
		this.bot = bot;
	}

	public int getPrice(){
		return 25;
	}

	public Cover getCover(){
		return bot;
	}

	public String getBeverageName(){
		return "Coke";
	}

	public String getItemName(){
		return getBeverageName();
	}

	public int totalCost(){
		return getPrice() + getCover().getPrice();
	}
	
}

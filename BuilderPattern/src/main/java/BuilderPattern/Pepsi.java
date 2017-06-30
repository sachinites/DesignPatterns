public class Pepsi extends Beverage{

	Bottle bot;
	Pepsi(Bottle bot){
		this.bot = bot;
	}

	public int getPrice(){
		return 25;
	}

	public Cover getCover(){
		return bot;
	}

	public String getBeverageName(){
		return "Pepsi";
	}

	public String getItemName(){
		return getBeverageName();
	}

	public int totalCost(){
		return getPrice() + getCover().getPrice();
	}
	
}

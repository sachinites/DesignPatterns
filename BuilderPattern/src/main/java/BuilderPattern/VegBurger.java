public class VegBurger extends Burger{

	Wrapper wrap;
	VegBurger(Wrapper wrap){
		this.wrap = wrap;
	}

	public int getPrice(){
		return 25;
	}

	public Cover getCover(){
		return wrap;
	}

	public String getBurgerName(){
		return "VegBurger";
	}

	public String getItemName(){
		return getBurgerName();
	}

	public int totalCost(){
		return getPrice() + getCover().getPrice();
	}
	
}

public class ChickenBurger extends Burger{

	Wrapper wrap;
	ChickenBurger(Wrapper wrap){
		this.wrap = wrap;
	}

	public int getPrice(){
		return 25;
	}

	public Cover getCover(){
		return wrap;
	}

	public String getBurgerName(){
		return "ChickenBurger";
	}

	public String getItemName(){
		return getBurgerName();
	}

	public int totalCost(){
		return getPrice() + getCover().getPrice();
	}

}

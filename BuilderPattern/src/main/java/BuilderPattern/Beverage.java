public abstract class Beverage implements Item{
	public abstract int getPrice();
	public abstract Cover getCover();
	public abstract int totalCost();
	public abstract String getBeverageName();
	public abstract String getItemName();
}

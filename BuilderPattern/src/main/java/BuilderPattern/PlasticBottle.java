public class PlasticBottle extends Bottle{
	public int getPrice(){
		return 10;
	}

	public String getBottleType(){
		return "PlasticBottle";
	}

	public String getCoverName(){
		return getBottleType();
	}
}

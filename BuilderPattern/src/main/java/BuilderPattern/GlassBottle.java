public class GlassBottle extends Bottle{
	public int getPrice(){
		return 30;
	}

	public String getBottleType(){
		return "GlassBottle";
	}

	public String getCoverName(){
		return getBottleType();
	}
}

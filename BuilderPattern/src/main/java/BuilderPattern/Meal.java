import java.util.ArrayList;

class Meal{
	ArrayList<Item> ar_ls;
	Meal(){
		ar_ls = new ArrayList<Item>();
	}

	public void addItem(Item i){
		ar_ls.add(i);
	}

	public void displayMeal(){
		Item it;
		int totalCost = 0;
		for(int i = 0; i < ar_ls.size(); i++){
			it = ar_ls.get(i);
			System.out.println("Total Cost = " + it.totalCost() + 
					 ", Cover = " + it.getCover().getCoverName() + 
					 ", ItemName = " + it.getItemName());
			totalCost += it.totalCost();
		}
			System.out.println("Meal Cost = " + totalCost);
	}
}

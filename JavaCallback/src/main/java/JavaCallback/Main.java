package JavaCallback;
import JavaCallback.*;

class Main{

	public static void main(String args[]){
		App appl = new App();
		Callback cb1 = new Callback1();
		Callback cb2 = new Callback2();
		
		appl.registerCallback(cb1);
		appl.registerCallback(cb2);

		appl.executeAllCallbacks();	
	}
}

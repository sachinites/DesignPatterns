package JavaCallback;

import JavaCallback.Callback;

class Callback2 implements Callback {

	Callback2(){}
	
	public void CallbackFn(Object arg){
		System.out.println("Callback2.CallbackFn is called");
	}	
}

package JavaCallback;

import JavaCallback.Callback;

class Callback1 implements Callback {

	Callback1(){}
	
	public void CallbackFn(Object arg){
		System.out.println("Callback1.CallbackFn is called");
	}	
}

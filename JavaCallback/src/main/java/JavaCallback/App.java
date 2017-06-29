package JavaCallback;

import JavaCallback.CallbackRegistrar;
import java.util.ArrayList;

public class App implements CallbackRegistrar 
{
	ArrayList<Callback> cb_al; 

	App(){
		cb_al = new ArrayList<Callback>();
	}

	public void registerCallback(Callback cb){
		cb_al.add(cb);			
	}

	public void executeCallback(Callback cb){
		cb.CallbackFn(null);
	}

	public void executeAllCallbacks(){
		for(int i = 0; i < cb_al.size(); i++){
			executeCallback(cb_al.get(i));
		}

	}
}


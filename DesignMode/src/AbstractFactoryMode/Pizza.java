package AbstractFactoryMode;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies;

	public abstract void prepare();
	
	public void bake(){
		System.out.println("烘烤");
	}
	
	public void cut(){
		System.out.println("切块");
	}
	
	void box(){
		System.out.println("装盒");
	}
	
	public String getName(){
		return name;
	}

}

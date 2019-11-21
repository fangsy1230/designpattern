package FactoryMode;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
	public void prepare(){
		System.out.println("准备"+name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i = 0;i<toppings.size();i++){
			System.out.println(" "+toppings.get(i));
		}
	}
	
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

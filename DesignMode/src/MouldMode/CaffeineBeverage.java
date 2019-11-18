package MouldMode;

public abstract class CaffeineBeverage {
	
	final void prepare(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsConditions()){
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("bioling water");
	}
	
	void pourInCup(){
		System.out.println("pouring into cup");
	}
	/**
	 * 这是一个钩子，子类可以覆盖这个方法，但不一定
	 * @return
	 */
	boolean customerWantsConditions(){
		return true;
	}

}

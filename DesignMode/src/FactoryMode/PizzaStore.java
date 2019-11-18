package FactoryMode;

public abstract class PizzaStore {
	
	//SimplePizzaFactory factory;
	
	//
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		
		return pizza;
	}
	
	//创建pizza的过程交给子类去完成
	public abstract Pizza createPizza(String type);

}

package FactoryMode;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		 Pizza pizza = null;
			
			if(type.equals("cheese")){
				pizza = new NYStyleChessePizza();
			}else{
				pizza = new QtPizza();
			}
			
			return pizza;
	}

}

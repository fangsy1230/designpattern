package AbstractFactoryMode;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		 Pizza pizza = null;
		 
		 PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
			
			if(type.equals("cheese")){
				pizza = new NYStyleChessePizza(ingredientFactory);
			}else{
				pizza = new QtPizza();
			}
			
			return pizza;
	}

}

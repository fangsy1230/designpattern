package AbstractFactoryMode;



public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
        Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new ChicagoStyleCheesePizza();
		}else{
			pizza = new QtPizza();
		}
		
		return pizza;
	}

}

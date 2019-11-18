package AbstractFactoryMode;

public class NYStyleChessePizza extends Pizza{
	
	PizzaIngredientFactory ingredientFactory;
	public NYStyleChessePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing" + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		
	}
	

}

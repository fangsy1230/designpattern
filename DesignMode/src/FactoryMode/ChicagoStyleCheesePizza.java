package FactoryMode;

public class ChicagoStyleCheesePizza extends Pizza{
     public ChicagoStyleCheesePizza(){
    	 name = "Chicago style deep dish cheese pizza";
    	 dough = "Extra thick crust dough";
    	 sauce = "Plum tomato sauce";
    	 
    	 toppings.add("shredded mozzarella cheese");
     }
     
     public void cut(){
    	 System.out.println("切成正方形");
     }
}

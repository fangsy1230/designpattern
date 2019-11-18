package FactoryMode;

import java.io.ObjectOutputStream.PutField;


public class Main {
	public static void main(String[] args){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("order a " + pizza.getName());
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("order a " + pizza.getName());
	}
	

}

package MouldMode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		Tea tea = new Tea();
		
		System.out.println("\nmaking tea ...");
		tea.prepare();
		
		System.out.println("\nmaking coffee ...");
		coffee.prepare();
		
		Duck[] ducks = {
				new Duck("Diffy", 8),
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Louie", 2),
				new Duck("Donald", 10),
				new Duck("Huey", 2),
		};
		display(ducks);
		Arrays.sort(ducks);
		System.out.println("+++++++++++++++++++++");
		display(ducks);
	}
	
	public static void display(Duck[] ducks){
		for(int i = 0;i<ducks.length;i++){
			System.out.println(ducks[i]);
		}
	}

}

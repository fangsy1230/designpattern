package MouldMode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Drippring coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	public boolean customerWantsConditions(){
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}
	
	private String getUserInput(){
		String answer = null;
		System.out.println("would you like milk or sugar with your coffee (y/n) ?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.out.println("IO error");
		}
		
		if(answer == null){
			return "no";
		}
		return answer;
	}

}

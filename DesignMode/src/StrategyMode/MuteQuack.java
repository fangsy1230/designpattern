package StrategyMode;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("slience");
		
	}

}

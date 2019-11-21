package StrategyMode;

public abstract class Duck {
	
	//多用组合，少用继承
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public  Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("all duck float,even decoys");
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
}

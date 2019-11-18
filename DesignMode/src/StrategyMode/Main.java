package StrategyMode;
/**
 * 『策略模式』定义了算法族，分别封装起来，让它 们之间可以互相替换，此模式让算法的变化独立于使用 算法的客户。
 * 把某类变化的行为，利用接口封装起来，利用接口不能的实现类去实现变化
 * @author fangshuyun
 *
 */
public class Main {
	
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
	

}

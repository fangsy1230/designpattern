package SimpleFactoryMode;
/**
 * 把类的实例化拿出来
 * @author fangshuyun
 *
 */
public class SimplePizzaFactory {
	
	public Pizza createPizza (String type){
		Pizza pizza = null;
		
		if(type.equals("chess")){
			pizza = new ChessPizza();
		}else if(type.equals("veggie")){
			pizza = new VeggiePizza();
		}else{
			pizza = new ChessPizza();
		}
		
		return pizza;
	}

}

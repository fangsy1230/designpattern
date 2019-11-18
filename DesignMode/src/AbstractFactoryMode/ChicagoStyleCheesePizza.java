package AbstractFactoryMode;

public class ChicagoStyleCheesePizza extends Pizza{
     public ChicagoStyleCheesePizza(){
     }
     
     public void cut(){
    	 System.out.println("切成正方形");
     }

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}

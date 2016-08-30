package designPatterns.adapter;
/**
 * ÊÊÅäÆ÷
 * @author Linbingfeng
 *
 */
public class Adapter extends Target {
	
	Adaptee adaptee = new Adaptee();
	@Override
	public void request(){
		adaptee.specificRequest();
	}
}

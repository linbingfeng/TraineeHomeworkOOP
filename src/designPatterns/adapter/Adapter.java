package designPatterns.adapter;
/**
 * 适配器
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

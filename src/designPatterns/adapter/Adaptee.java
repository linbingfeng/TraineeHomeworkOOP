package designPatterns.adapter;
/**
 * 需要适配的类
 * @author Linbingfeng
 *
 */
public class Adaptee {
	
	public void specificRequest() {
		System.out.println("This is a specific request!");
	}
}

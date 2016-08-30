package designPatterns.register;

/**
 * 单例模式
 * @author Linbingfeng
 *
 */
public class Single {
	
	private static Object obj = null;
	
	public static Object getInstance(){
		if(obj == null){
			obj = new Object();
		}
		return obj;
	}
}

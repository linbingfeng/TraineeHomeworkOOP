package designPatterns.register;

/**
 * ����ģʽ
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

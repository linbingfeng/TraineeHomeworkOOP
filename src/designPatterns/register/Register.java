package designPatterns.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册树模式
 * @author Linbingfeng
 *
 */
public class Register {
	public static Map<String,String> objs = new HashMap<String,String>();
	
	public static void set(String key,String value) {
		objs.put(key, value);
	}
	
	public static Object get(String key) {
		return objs.get(key);
	}
	
	public static Object remove(String key) {
		return objs.remove(key);
	}
}

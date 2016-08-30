package designPatterns.register;

import java.util.Map;

/**
 * ×¢²áÊ÷Ä£Ê½
 * @author Linbingfeng
 *
 */
public class Register {
	public static Map<Object,Object> objs;
	
	public static void set(Object key,Object value) {
		objs.put(key, value);
	}
	
	public static Object get(Object key) {
		return objs.get(key);
	}
	
	public static Object remove(Object key) {
		return objs.remove(key);
	}
}

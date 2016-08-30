package designPatterns.register;

public class Factory {
	
	public static String createObj(String string) {
		String s = new String(string);
		return s;
	}
}

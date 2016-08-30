package designPatterns.observer;

/**
 * 具体观察者
 * @author Linbingfeng
 *
 */
public class ConcreteWatcher implements Watcher {
	
	private String name; 
	
	public ConcreteWatcher(String name) {
		this.name = name;
	}
	@Override
	public void update(String name) {
	    
		System.out.println(name);
	}

}

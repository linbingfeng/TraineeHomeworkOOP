package designPatterns.observer;

/**
 * ����۲���
 * @author Linbingfeng
 *
 */
public class ConcreteWatcher implements Watcher {

	@Override
	public void update(String str) {
	    
		System.out.println(str);
	}

}

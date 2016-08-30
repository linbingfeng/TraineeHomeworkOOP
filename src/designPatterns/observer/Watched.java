package designPatterns.observer;
/**
 * ³éÏóÖ÷Ìâ
 * @author Linbingfeng
 *
 */
public interface Watched {
	
	public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String str);
}

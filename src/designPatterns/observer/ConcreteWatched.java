package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 * @author Linbingfeng
 *
 */

public class ConcreteWatched implements Watched {

	private List<Watcher> list = new ArrayList<Watcher>();
	
	@Override
	public void addWatcher(Watcher watcher) {
		
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {
		
        for (Watcher watcher : list)
        {
            watcher.update(str);
        }
	}

}

package test;

import designPatterns.adapter.Adaptee;
import designPatterns.adapter.Adapter;
import designPatterns.adapter.Target;
import designPatterns.observer.ConcreteWatched;
import designPatterns.observer.ConcreteWatcher;
import designPatterns.observer.Watched;
import designPatterns.observer.Watcher;
import designPatterns.register.Factory;
import designPatterns.register.Register;
import sun.net.www.content.audio.wav;

public class DesignPatternsTest {
	
	public static void main(String[] args) {
		System.out.println("****ObserverPattern****");
		testObserverPattern();
		System.out.println("****AdapterPattern****");
		testAdapterPattern();
		System.out.println("****RegisterPattern****");
		testRegister();
	}

	static void testObserverPattern() {
		Watcher A = new ConcreteWatcher("A");
		Watcher B = new ConcreteWatcher("B");
		Watcher C = new ConcreteWatcher("B");
		

		Watched W = new ConcreteWatched();
		W.addWatcher(A);
		W.addWatcher(B);
		W.addWatcher(C);
		W.notifyWatchers("D");
	}

	static void testAdapterPattern() {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter();
		target.request();
	}

	static void testRegister() {
		String s1 = Factory.createObj("abc");
		String s2 = Factory.createObj("123");
		
		Register.set("s1", s1);
		Register.set("s2", s2);

		Object ss1 = Register.get("s1");
		Object ss2 = Register.get("s2");
		System.out.println(s1.hashCode());
		System.out.println(ss1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(ss2.hashCode());
	}
}

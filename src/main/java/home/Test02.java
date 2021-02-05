package home;
/**
 * 修改下面代码的编译
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Foo f=new Foo();
		Thread t1 = new Thread() {
			public void run(){
				f.dosome();
			}
		};
		Thread t2 = new Thread() {
			public void run(){
				f.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Foo{
	public static void dosome() {
		synchronized (Foo.class) {
			System.out.println("hello!");
		}
	}
}


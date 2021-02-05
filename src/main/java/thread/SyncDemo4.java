package thread;

/**
 * 互斥锁
 * 当使用synchronized锁多个代码片段，并且这些同步块指定的同步监视器对象相同时
 * zhex代码片段之间就是互斥的，多个线程不能同时执行他们
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Foo f=new Foo();
        Thread t1=new Thread(){
          public void run(){
              f.mathodA();
          }
        };
        Thread t2=new Thread(){
            public void run(){
                f.mathodB();
            }
        };
        t1.start();
        t2.start();
    }
}
class Foo{
    public synchronized void mathodA(){
        try {
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"正在执行A");
            Thread.sleep(5000);
            System.out.println(t.getName()+"执行完A");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public  void mathodB() {
        synchronized (this) {//和上面的一样
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + "正在执行b");
                Thread.sleep(5000);
                System.out.println(t.getName() + "执行完b");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
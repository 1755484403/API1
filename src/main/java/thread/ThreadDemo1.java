package thread;

/**
 * 多线程
 * 多线程可以让多个代码片段并发执行，造成以种同时运行的现象。
 *
 * 线程有两种创建方式
 * 方式1：继承Thread并重写run方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread i1=new MyThread1();
        Thread i2=new MyThread2();
        /*
        注意，启动线程的时候要调用线程的start方法，而不是直接调用run方法！
        线程调用start方法后会纳入到线程调度器中，线程调度器会分派CPU时间片段给
        当前线程使得他可以和其他线程并发运行。
        当线程带一次获取时间片段时会自动执行run方法。
         */
        i1.start();
        i2.start();
    }
}

/**
 * 第一种创建线程的方式优点在于结构简单，利于匿名内部类形式创建
 * 缺点有两个
 * 1：由于JAVA是单一继承的，这导致如果继承了Thread就无法在继承其他类去复用方法，实际开发中
 * 是非常不方便的
 * 2：定义线程的同时重写了run方法，这是导致将任务直接定义了线程中使得路线与任务存在必然的
 * 耦合关系，不利于线路的重用。
 */
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("去死");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("好好");
        }
    }
}

package thread;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.lang.management.ThreadInfo;

/**
 * java中所有的代码都是靠线程运行的，main方法也不例外。运行main方法的线程是系统创建的
 * 并且起名字为main，我们自己定义的线程如果不指定名字，默认叫Thread-X。X是是一个数字，从0开始
 *
 * static Thread currentThread()
 * 线程提供了一个静态方法currentThread,可以获取运行这个方法的线程
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        //获取运行main方法的线程
        Thread main=Thread.currentThread();
        System.out.println("运行main方法的线程是："+main);
        dosome();
        Thread t=new Thread(){
            public void run(){
                Thread t=Thread.currentThread();
                System.out.println("自定义线程"+t);
                dosome();
                for(int i=0;i<100;i++){
                    System.out.println(t+"循环"+i+"次");
                }
                System.out.println(t+"线程结束");
            }
        };
        t.start();//t线程一旦是start后 并发运行了。
        for(int i=0;i<100;i++){
            System.out.println(main+"循环"+i+"次");
        }
        System.out.println("main方法执行完毕，主线程结束");
    }
    public static void dosome(){
        Thread t=Thread.currentThread();
        System.out.println("运行dosome方法的线程是"+t);
    }


}
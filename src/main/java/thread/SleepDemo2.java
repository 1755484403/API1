package thread;

/**
 * sleep方法要求必须处理中断异常。（Thread还提供了其他会导致线程堵塞的方法，很多要求处理
 * 这个异常，情况是一样的。）
 *
 * 当一个线程调用sleep方法处于睡眠堵塞呆的过程中，此时该线程的interrupt方法被调用时，会中断
 * 这个堵塞过程，此时该方法会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin=new Thread(){
            public void run(){
                System.out.println("林要睡觉");
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {

                    System.out.println("干嘛呢 干嘛呢");
                }
                System.out.println("林醒了");
            }
        };
        Thread huang=new Thread(){
            public void run(){
                System.out.println("大锤80，小锤40");
                for(int i=0;i<5;i++){
                    System.out.println("80");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("搞定");
                lin.interrupt();//中断lin的睡眠
            }

        };
        lin.start();
        huang.start();

    }
}

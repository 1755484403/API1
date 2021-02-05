package thread;

/**
 * 线程的优先级
 * 线程有10个优先级，分别有整数1-10表示。其中1为最低，5为默认，10为最高
 * 当线程start方法执行后，该线程纳入到线程调速器中统一管理。线程只有被动的分配时间片与其他
 * 线程并发执行，而不能主动获取时间片。线程调度器尽可能均匀的分配时间片给每个线程。
 * 改变一个线程的优先级可以最大程度的改善线程获取时间
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread norm=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("norm");
                }
            }
        };
        Thread max=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("max");
                }
            }
        };
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.NORM_PRIORITY);
        min.start();
        norm.start();
        max.start();
    }
}

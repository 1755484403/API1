package thread;

import java.util.Scanner;

/**
 * 线程提供的方法
 * stativ void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒。超时后线程会自动回到RUNNABLE状态
 * 再次获取时间片并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {
//        System.out.println("开始");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("结束");


        Scanner scan=new Scanner(System.in);
        System.out.println("输入时间");
        int i=scan.nextInt();
        for(int o=i;o>0;o--) {
            System.out.println(o);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("完成");
    }
}

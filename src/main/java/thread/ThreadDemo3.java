package thread;

/**
 * 使用匿名内部类的形式完成两种线程的创建
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread ti = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("444");
                }
            }
        };

            Runnable t2 = new Runnable() {
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("111");
                    }
                }
            };
            Thread i=new Thread(t2);
            i.start();
            ti.start();



    }
}
package exception;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 异常处理机制中的try-catch
 */
public class TryCatchDemo {
    public static void main(String[] args){
        System.out.println("程序开始了");
        try {
           // String str = null;
            //String str ="";
            String str="abc";
        /*
        如果str为null，当虚拟机执行到下面的代码会发现这里存在
        空指针现象，于是虚拟机会实例化一个空指针异常的实例，并将其
        抛出。抛出后会检查报错的这句话是否异常处理机制控制，如
        果没有则会将该异常抛出到当前方法外面，由调用该方法的代码
        去解决
        */
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            System.out.println("2222222222");
            //try 语句块中报错代码以下内容都不会被执行
            //catch用来捕获try中出现的指针异常并予以解决
        }catch (NullPointerException e){
            System.out.println("错误错误错误错误错误错误错误错误错误错误错误错误错误错误错误错误");
            String str="456";
            System.out.println(str);
        }catch (StringIndexOutOfBoundsException o){
            System.out.println("字符串越界");
            /*
            catch 超类异常的意义
            当try中某几类异常希望使用相同的处理办法时，可以catch这些异常的超类
            在最后一个catch出捕获Exception也可以避免因为一个未处理
            的异常导致程序中断

            当多个catch的异常之间存在继承关系时，子类型异常要在
            上面先行捕获，超类异常在下。否则编译不通过
             */
        }catch (Exception e){
            System.out.println("");
        }
        System.out.println("程序结束了");

    }
}

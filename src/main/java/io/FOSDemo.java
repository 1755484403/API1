package io;

import java.io.*;

/**
 * java标准的IO 可以用相同的读写方式读写不同的设备
 * JAVA将IO比喻为流，可以理解为是连接程序与设备之间的管道。管道
 * 里面是按照同一个方向顺序流动的字节
 *
 * java将流的方向划分为两个操作
 * 输入：用来读取。是从设备到程序的方向。，是获取数据使用的
 * 输出：用来写出，是程序到设备的方，是用来发送数据使用的
 *  java.io.InputStream是所有字节输入流的超类，里面定义了
 *
 *  处理流：也称为高级流。不能独立存在
 *
 *  文件流
 *  文件流是一对低级流，用于读写文件的流，功能上与RandomAccessFile一致
 *  java.io.FileInputStream和FileOutputStream
 *
 *
 *
 *  /**
 *  * java 标准的IO，可以用相同方式读写不同的设备
 *  * java 将IO比喻为 “流” ，可以理解为是连接程序与设备的管道，
 *  * 管道是按照同一方向顺序流动的字节
 *  *
 *  * java将流的方向分为两个操作
 *  * 输入：用来读取，是从程序到设备的方向，是获取数据时使用
 *  * 输入：用来写出，是从设备到程序的方向，是发送数据时使用
 *  *
 *  * java.io.InputStream是所有字节输入流的超类，里面定义了读取字节的方法
 *  * java.io.OutputStream是所有字节输出流的超类，里面定义了写入字节的方法
 *  *
 *  * java将流分为两类 节点流和处理流
 *  * 节点流：低级流，是实际连接程序与设备的管道，故障实际读取字节的流
 *  *        读写一定是建立在节点流的基础上，操作不同的设备有对应的低级流
 *  *        例如读写文件有文件流
 *  * 处理流：称为高级流，不能独立存在，必须连接在其他流上，目的是当数据
 *  *        流经当前流时对其加工，简化操作
 *  * 实际开发中我们总是会串联一组高级流最终连接到低级流上，在数据进行读写
 *  * 过程中对数据做流水线的加工处理，这也成为流连接
 *  *
 *  * 文件流：低级流，用于读写文件的流，功能上与RandomAccessFile一致
 *  *
 *  * java.io.FileInputStream和FileOutputStream
 *  */


public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        文件输出流创建方法：
        FileOutputStream(String path)
        FileOutputStream(File file)
        已上两种构造器创建的文件流为覆盖写模式
        即：创建文件流时如果指定的文件已经存在，则会将该文件内容清空
        然后是用这个流写出的数据会顺序写入文件作为新数据保存
        注：RAF则是从头开始写多少覆盖多少。（在不操作指针的情况下）

        * 文件流重载的构造方法
         * FileOutputStream(String path,boolean append)
         * FileOutputStream(File file,boolean append)
         * 如果第二个参数指定，并且指定的为true时，则当前文件流为
         * 追加模式。即：创建文件时如果文件存在，那么文件原有的数据保留
         * 通过这个流写入的数据都会追加到文件中。


         */
        FileOutputStream fos=new FileOutputStream("www.lll",true);
        String lin="就开始叫对方老师看见代理反馈聚少离多";
        byte[] data=lin.getBytes("UTF-8");
        fos.write(data);
        lin="       klsdjflksjfklsj";
        fos.write(lin.getBytes("UTF-8"));
        fos.write("咖啡金色覅借方金额".getBytes("UTF-8"));
        fos.write("发克里斯多夫说法".getBytes("UTF-8"));
        System.out.println("写出完毕");
        fos.close();

    }
}

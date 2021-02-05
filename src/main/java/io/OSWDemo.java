package io;

import java.io.*;

/**
 * 字符串 java.io.Reader和java.io.Writer
 * java将流按照读写单位画分为字节流与字符流
 * 字节流的超类是java.io.InputStream和OutputStream
 * 而字符流的超类是：jaava.io.Reader和java.io,Writer
 * 他们的区别是读写单位不同，字节流最小读写单位为一个字节，而字符流
 * 最小的读写单位为一个char  一个字符
 *
 * 转换流：java.io.InputStreamReader和java.io.OutputStreamWriter
 * 转换流是常用的字节流
 *
 * 因为其他高级字符流都有一个共同特点，在流连接中只能连接其他的字符流
 * 而真实读写设备的低级流通常都是字节流，这会导致这些高价字符流不能直接
 * 连接字节流。而转换流就在其中起到转换器的作用，他可以连接字节流
 * 并且他又是字符流，其他的字符流可以连接他。而他就负责将字符转换为字节
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("osw.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        osw.write("夜空中最亮的星，");
        osw.write("能否听清");
        System.out.println("完毕");
        osw.close();

    }
}

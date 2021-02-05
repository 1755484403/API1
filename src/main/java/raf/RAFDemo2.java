package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文档中读取数据
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf.dat","r");
        int b=raf.read();
        System.out.println(b);
        int o=raf.read();
        System.out.println(o);
        o=raf.read();
        System.out.println(o);
        raf.close();
    }
}

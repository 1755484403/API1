package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件的类。其基于指针对文件进行随机读写
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        RAF常用构造器
        RandomAccessFile(File file,String mode)
        RandomAccessFile(String path,String mode)
        第一个参数为要进行读写的文件。可以传入FILE队象也可以
        直接给定该文件的路径
         */
        RandomAccessFile raf=new RandomAccessFile("./raf.dat","rw");
        raf.write(-1);//11111111
        raf.write(2);//00000010
        System.out.println("输出完毕");
        raf.close();//释放内存**
    }
}

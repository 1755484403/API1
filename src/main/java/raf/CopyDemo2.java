package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量减少实际读写的次数可以提高读写效率
 * 单字节读写是随机读写
 * 一组字节读写是快读写
 * 对于机械硬盘而言，单字符读写几乎没有效率可言
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile("u.jpg","rw");
        RandomAccessFile desc=new RandomAccessFile("uuu.jpg","rw");
        //int read(byte[] data);
        byte[] data=new byte[1024*10];
        int len;
        //long start=System.currentTimeMillis();
        while ((len=src.read(data))!=-1){
            //desc.write(data);会出现原来的比复制的内存大
            desc.write(data,0,len);//读多少写多少
        }
        //long end=System.currentTimeMillis();
        System.out.println("完毕");
        src.close();
        desc.close();
    }
}

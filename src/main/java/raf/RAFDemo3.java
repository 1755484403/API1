package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据，以及RAF指针的操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("lll.lll","rw");
        long pos=raf.getFilePointer();
        System.out.println(pos);//0
        int i=Integer.MAX_VALUE;
        raf.write(i>>>24);
        System.out.println(raf.getFilePointer());//1
        raf.write(i>>>16);
        System.out.println(raf.getFilePointer());//2
        raf.write(i>>>8);
        System.out.println(raf.getFilePointer());//3
        raf.write(i);
        System.out.println(raf.getFilePointer());//4
        raf.writeInt(i);//8
        raf.writeLong(446);//16
        System.out.println(raf.getFilePointer());//16
        System.out.println("w");
        //raf.seek(16);
       raf.writeLong(456L);
       // int d=raf.readInt();
       // System.out.println(d);
        System.out.println(raf.getFilePointer());
       // long o=raf.readLong();
        //System.out.println(o);
        raf.close();
    }
}

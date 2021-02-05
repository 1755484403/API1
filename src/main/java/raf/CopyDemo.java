package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("bee.png","r");
        RandomAccessFile r=new RandomAccessFile("be.png","rw");
        int b;
        long start=System.currentTimeMillis();
        while ((b=raf.read())!=-1){
            r.write(b);
        }
        long end=System.currentTimeMillis();
        System.out.println("时间"+(end-start)+"毫秒");
        //System.out.println(start);
        System.out.println("w");
        raf.close();
        r.close();
    }
}

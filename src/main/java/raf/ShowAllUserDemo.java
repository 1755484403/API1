package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有的用户信息读取出来并输出的控制台
 */
public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("lll.ww","r");
        for(int i=0;i<raf.length()/100;i++) {
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data, "UTF-8").trim();

            raf.read(data);
            String password = new String(data, "UTF-8").trim();

            raf.read(data);
            String niclname = new String(data, "UTF-8").trim();

            int age = raf.readInt();
            System.out.println(username+","+password+","+niclname+","+age);
        }
        raf.close();
    }
}

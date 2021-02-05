package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 *
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
        1：创建文件输入流读取源文件
        2：创建文件输出流写入复制文件
        3：循环块写完成复制
        4：关闭两个流
         */
        FileInputStream fos=new FileInputStream("www.lll");
        FileOutputStream fo=new FileOutputStream("ww.ll");

       byte[] data = new byte[10 * 1024];
        int len;
       while (( len=fos.read(data))!=-1) {

          len = fos.read(data);

           String line = new String(data, 0, len, "UTF-8").trim();
           data = line.getBytes("UTF-8");
           fo.write(data, 0, len);
       }
        System.out.println("完毕");
        fos.close();
        fo.close();
    }
}

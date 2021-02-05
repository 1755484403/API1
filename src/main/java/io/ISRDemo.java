package io;

import java.io.*;

/**
 * 使用转换流读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        //将osw.txt文件中的字符读取出来
        FileInputStream fis=new FileInputStream("osw.txt");
        InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
        int b;
        /*
        int read()
        字符流的read()方法第读取一个字符，返回的是一个“char"
        但实际是用int型返回。因此该int值对应的2进制是低16位
        有效。如果int返回值为-1则表示文件末尾。
         */
        while ((b=isr.read())!=-1){
            System.out.print((char)b);
        }
        isr.close();
    }
}

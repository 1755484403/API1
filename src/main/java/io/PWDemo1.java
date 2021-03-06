package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符输出流
 * java.io.BufferedWriter
 * 内部有缓冲区，可以快写文本数据来加快写出数据速度
 *
 * java.io.OrintWriter
 * 具有自动行刷新的缓冲字符输出流，内部总是连接BufferedWriter作为其
 * 缓冲功能
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向pw.txt文件中
        /*
        PW提供了直接对文件做操作的构造方法
        PrintWriter(String path)
        PrintWriter(File file)
         */
        PrintWriter pw=new PrintWriter("pw.txt","UTF-8");
        pw.println("让我掉下眼泪的，不止昨夜的酒.");
        pw.println("让我依依不舍的，不止你的温柔.");
        System.out.println("完毕");
        pw.close();
    }
}

package io;

import java.io.*;

/**
 * 使用流连接形式创建PW完成文本数据的写出操作
 */
public class PWDemo2 {
    private static Object BufferedWriter;

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos=new FileOutputStream("pw2.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter g=new BufferedWriter(osw);
        PrintWriter i=new PrintWriter(g);
        i.println("成都带不走的只有你");
        i.println("哦哦哦哦哦");
        System.out.println("完毕");
        i.close();
    }
}

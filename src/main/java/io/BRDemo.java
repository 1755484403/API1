package io;

import java.io.*;

/**
 * 缓冲字符输出
 * java.io.BufferedReader
 * 内部类维护一个缓冲区可以块读文本数据，并且可以按照行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fos=new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader fis=new InputStreamReader(fos);
        BufferedReader i=new BufferedReader(fis);
        String line;
        /*
        BufferedReader提供的方法：
        String readLine()
        读取一行字符串，读取到换行符停止，并将换行符之前的内容’以
        一个字符串形式返回（不含有最后的换行符
        如果此行为空行，即：只有换行符，则返回值为空字符串
        如果此方法返回值为null 说明流读取到了末尾

         */
        while ((line=i.readLine())!=null){
            System.out.println(line);
        }
        i.close();
    }
}

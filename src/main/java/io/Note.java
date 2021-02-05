package io;

import java.io.*;
import java.util.Scanner;

public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入文件名 ");
        String i=scan.nextLine();

        FileOutputStream o=new FileOutputStream(i+".txt",true);
        OutputStreamWriter p=new OutputStreamWriter(o,"UTF-8");
        BufferedWriter l=new BufferedWriter(p);
        /*
        当创建PW时第一个参数为流，则可以再传入一个boolean型的参数
        如果这个值为true，则当前pw具有自动行刷新功能。即：
        每当我们调用println方法会自动flush
         */
        PrintWriter m= new PrintWriter(l);
        System.out.println("请输入内容 输入999结束");
        String w=scan.nextLine();
        while (!w.equals("999")){

            w=scan.nextLine();
            m.println(w);
        }
        System.out.println("jei");
        m.close();

    }
}

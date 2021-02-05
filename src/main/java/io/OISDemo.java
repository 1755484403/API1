package io;

import java.io.*;

/**
 * 对象输入流
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //读取persom.obj文件中的Person对象
        FileInputStream fis=new FileInputStream("ww.ll");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Person i=(Person)ois.readObject();
        System.out.println(i);
        ois.close();
    }
}       

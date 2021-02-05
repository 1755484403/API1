package io;

import java.io.*;

/**
 * 将Person对象写入文件
 *
 * 对象流：java.io.ObjectOutputStream和ObjectInputStream
 * 对象流是一对高级流，作用是进行对象的
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name="苍老师";
        int age =18;
        String gender="你";
        String[] otherIngo={"演员","来自岛国","促进中日文化交流"};
        Person person=new Person(name,age,gender,otherIngo);
        FileOutputStream fos=new FileOutputStream("ww.ll");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        /*
        对象输出流提供了一个独有的方法：
        void weiteOnject(Object obj)
        该方法可以将给定的对象按照其结构转化为一组字节后写出
        需要注意，该方法要求写出的对象必须实现了

        将一个对象按照其结构转化为一组字节的过程称为对象序列化
        反之则称对象反序列化
         */
        oos.writeObject(person);
        System.out.println("完毕");
        oos.close();
    }
}

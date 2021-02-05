package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册
 * 程序启动后要求用户顺序输入用户名，密码，昵称和年龄、
 *
 */

public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        RandomAccessFile raf=new RandomAccessFile("lll.ww","rw");
        raf.seek(raf.length());
        System.out.println("欢迎注册");
        System.out.println("名字");
        String username=scan.nextLine();
        System.out.println("密码");
        String password=scan.nextLine();
        System.out.println("昵称");
        String niclname=scan.nextLine();
        System.out.println("年龄");
        int age=scan.nextInt();
        byte[] data =username.getBytes("UTF-8");
        data= Arrays.copyOf(data,32);
        raf.write(data);

        data =password.getBytes("UTF-8");
        data= Arrays.copyOf(data,32);
        raf.write(data);

        data=niclname.getBytes("UTF-8");
        data=Arrays.copyOf(data,32);
        raf.write(data);

        raf.writeInt(age);
        System.out.println("完毕");
        raf.close();


    }
}

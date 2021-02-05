package raf;

/**
 * 简易记事本工具
 * 程序启动后要求用户出入一个文件名，然后对该文件进行写操作
 * 之后用户在控制台数
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import  java.util.Scanner;
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        String i=scan.nextLine();
        RandomAccessFile file=new RandomAccessFile(i,"rw");
        System.out.println("创建完成 请继续");

        String o=scan.nextLine();
        while (!"exit".equals(o)){
            System.out.println("还有吗");
            o=scan.nextLine();
            byte[] data=o.getBytes("UTF-8");
            file.write(data);
        }
        file.close();
        System.out.println("已退出");

    }
}

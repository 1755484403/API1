package file;

import java.io.File;

/**
 * java.io.File表示硬盘上的一个文件目录
 * 使用File可以
 * 1.访问该文件或目录的属性信息（大小，修改日期，可读可写）
 * 2.创建或删除文件和目录
 * 3.访问一个目录中的所有项
 *
 * 但是File不能访问文件中的数据
 */
public class FileDemo {
    public static void main(String[] args) {
        /*
        File 创建时可以指定路径
        该路径通常使用相对的路径，他有更好的跨平台性

        ./表示当前目录
         */
        File file=new File("./demo.txt");
        String  name=file.getName();
        System.out.println(name);

        long len=file.length();
        System.out.println(len+"字节5555");

       boolean cr=file.canRead();
        System.out.println("可读"+cr);
        boolean cw=file.canWrite();
        System.out.println("可写"+cw);
        boolean ih=file.isHidden();
        System.out.println("是否隐藏"+ih);

    }

}

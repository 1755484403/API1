package file;

import java.io.File;

/**
 * 删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //相对路径中“./”可以不写，不写默认就是从./开始的
        File file=new File("test.txt");
        if(file.delete()){
            file.delete();
            System.out.println("已删除");
        }else{
            System.out.println("文件不存在");
        }
    }
}

package file;

import java.io.File;

/**
 * 使用File创建目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下创建一个目录demo
        File dir=new File("demo");
        if(dir.exists()){
            System.out.println("已存在");
        }else{
            dir.mkdir();//创建
            System.out.println("已创建");
        }
    }
}

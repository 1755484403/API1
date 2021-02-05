package file;

import java.io.File;

/**
 * 创建一个多级目录
 */
public class MkDirsDemo {
    public static void main(String[] args) {
        File dir=new File("./a/b/c");
        if(dir.exists()){
            System.out.println("已存在");
        }else{
            dir.mkdirs();
            System.out.println("已创建");
        }
    }
}

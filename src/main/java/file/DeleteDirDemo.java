package file;

import java.io.File;

/**
 * 是删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir=new File("./demo");
        if(dir.exists()){
            //
            dir.delete();
            System.out.println("已删除");
        }else{
            System.out.println("不存在");
        }

    }
}

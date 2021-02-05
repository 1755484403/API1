package file;

import java.io.File;

/**
 * 获取一个目录中的子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        File dir =new File(".");
        if(dir.isDirectory()){
            File[] subs=dir.listFiles();
            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}

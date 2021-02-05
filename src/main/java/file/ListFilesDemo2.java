package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中满足指定条件的所有子项
 *
 * File[] listFiles(FileFilter filter)
 * 将当前FILE对象表示的目录中所有字符给
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        //名字中有e
        File dir=new File(".");
        if(dir.isDirectory()){
           // MyFilter filter=new MyFilter();
            FileFilter filter=new FileFilter(){
                public boolean accept(File file){
                    String name=file.getName();
                    return name.contains("e");
                }
            };
            File[] subs=dir.listFiles(filter);
            System.out.println("子项个数"+subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}

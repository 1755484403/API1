package lambde;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8之后推出了一个新的特性：lambda表达式
 * lanbda表达式可以用更简短的语法创建匿名内部类
 * 语法
 * （参数列表）->{
 *     方法体
 * }
 * 接口只能有一个匿名方法
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        //
       /* FileFilter filter=new FileFilter(){
            public boolean accept(File file){
                String name=file.getName();
                return name.contains("e");
            }
        };*/

        File file1=new File(".");
        FileFilter filter1=(File file)->{
          return file.getName().contains("e");
        };
        //参数类型可以忽略不写
        FileFilter filter2=(file)->{
            return file.getName().contains("e");
        };

        /*
        当方法中只有一句代码大括号可以不写
        同是关键字也不能写return
         */
        FileFilter filter3= (File file)-> file.getName().contains("e");

    }
}

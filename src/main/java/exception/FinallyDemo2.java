package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在IO操作中使用异常处理机制
 */
public class FinallyDemo2 {
    public static void main(String[] args){
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream("ooo.oo");
            fos.write(1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
           try{
               if(fos!=null){
                   fos.close();
               }
           }catch (IOException e){
               e.printStackTrace();
           }
        }

    }
}

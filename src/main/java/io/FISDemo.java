package io;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.undo.AbstractUndoableEdit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *使用文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("www.lll");
        byte[] data=new byte[1000];
        int len=fis.read(data);
        System.out.println("实际读取了"+len+"个字节");
        /*
        将给定的字节数组从下标offset处的连续len个字节按照UTF-8
        编码转换为字符串

         */
        String line=new String(data,0,len,"UTF-8").trim();
        System.out.println(line);
        System.out.println(line.length());

    }
}

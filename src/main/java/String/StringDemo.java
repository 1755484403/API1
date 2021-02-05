package String;
import java.io.StringReader;
import java.util.*;

/**
 * 字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间，用于缓存所有使用字面量形式
 * 创建字符串对象，当再次使用相同字面量创建字符串时会直接重用常量池里的对象而不会再次创建新对象
 * 减少内存开销。
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        System.out.println(s1);
        String  s2 = "123abc";
      //System.out.println(s1==s2);
        String s3 = new String("123abc");
      //System.out.println(s1==s3)
        // System.out.println(s2.equals(s3));

        s1+="!";
       // System.out.println(s1==s2);

        String s4 = "123"+"abc";  //直接
        System.out.println(s2==s4);

        String s5="123";
        String s6=s5+"abc";
        System.out.println(s6==s2);

    }
}

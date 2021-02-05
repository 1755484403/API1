package String;

/**
 * static String valueOf()
 * String 提供了一组重载的静态方法：valueOf ，作用是将java中其他类型转换为String
 * 最常使用与将基本类型转换为字符串
 */
public class ValueOfDemo {
    public static void main(String[] args) {

        int i = 123;
        String str =String.valueOf(i);
        System.out.println(str);

        float f =333.3f;
        String ss = String.valueOf(f);
        System.out.println(ss);

        String s = i+" ";
        System.out.println(s);

        if(ss instanceof String){
            System.out.println("sss");
        }
    }
}

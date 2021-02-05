package String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * boolean startsWith(String str)
 * 判断字符串是否是以给定的字符串开始
 *
 * boolean endsWith(String str)
 * 判断字符串是否是以给定的字符串结尾
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        boolean aa = str.startsWith("www");
        System.out.println(aa);


        boolean aaa = str.endsWith("cn");
        System.out.println(aaa);
    }

}

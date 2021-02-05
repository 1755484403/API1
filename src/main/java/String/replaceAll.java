package String;

/**
 * String 支持正则表达式之三
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换给定内容
 */
public class replaceAll {
    public static void main(String[] args) {
        /*String srt = "as789s4fe84g49r4654da4da4gr8t";
         srt = srt.replaceAll("[0-9]+","NUMBER");
         System.out.println(srt);
         String str =srt.replaceAll("[0-9]+","");
         System.out.println(str);*/

        String str = "nm，一直抓我，wsnd吗";

        String mis =str.replaceAll("(wc|wct|st|nm|djb|wsnd|sei)","***");
        System.out.println(mis);
    }
}

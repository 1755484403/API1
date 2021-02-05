package String;

/**
 * String 支持正则表达式方法之二：
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分以
 * 一个String数组形式返回。
 */
public class SplitDemo {
    public static void main(String[] args) {

        String str = "35h.3h.oa,ho3.3j5,hpw.j34,p.oe,2";
        String a[] = str.split("[0-9]+");
        for (String i:a) {
            System.out.println(i);
        }
        System.out.println("---------------------------");
        /*
              ","在前需拆分，拆分出空字符串，在后无论多少都会省略。
         */
        String b[] =str.split(",");
        for (String i:b) {
            System.out.println(i);
        }
        System.out.println("---------------------------");
        //
        String c[] = str.split("\\.");
        for (String i:c) {
            System.out.println(i);
        }
    }
}

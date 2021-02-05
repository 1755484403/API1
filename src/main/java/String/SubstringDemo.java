package String;

/**
 * String substring(int start,int end)
 * 借钱指定范围内的字符串，两个参数是范围对应的下标
 * 注：在JAVA API中通常用两个数字表示范围时都是"含头不含尾"的。
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String nn="www.tedu.cn";
        String ins=nn.substring(4,8);  //含头不含尾
        String inns = nn.substring(4); //一刀切
        System.out.println(ins);
        System.out.println(inns);
    }
}

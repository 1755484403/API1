package String;



/**
 * String 的优化导致其为不变的对象，这会存在利于重用大师不利于修改操作。
 * 频繁修改导致String会降低性能并有较多的系统开销。
 *
 * java.lang.StringBuilder 是专门设计用来修改String的API，其内部维护
 * 一个可变的char数组，并提供了多种修改字符串内容的方法，例如：增删改插，和String
 *
 *
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";

        //StringBuilder builder = new StringBuilder();     无参

        StringBuilder builder = new StringBuilder(str);

        builder.append(",为了找好工作！！");//增
        str =builder.toString();
        System.out.println(str);

        builder.replace(1,4,"改变");//改
        System.out.println(builder.toString());
        builder.delete(0,7);//删

        System.out.println(builder.toString());
        builder.insert(0,"活着");//插
        System.out.println(builder.toString());

        builder.reverse(); //反转
        System.out.println(builder.toString());
    }

}

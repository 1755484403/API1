package integer;

/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题，使得基本
 * 类型可以以“对象”的形式存在
 * 包装类定义在java.lang包中作为基础类使用，6个数字的包装类
 * 继承Number 其余全部继承Object
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int d =1;
        Integer i1 = new Integer(d);
        Integer i2 = new Integer(d);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        Integer i3 =Integer.valueOf(d);
        Integer i4 =Integer.valueOf(d);
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));


        int  i = i1.intValue();
        System.out.println(i);

        double ii = i3.doubleValue();
        System.out.println(ii);


    }

}

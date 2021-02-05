package integer;

/**
 * JDK5推出了一个特性 自动开装箱
 * 改特性是编译器认可的，当我们在基本类型引用与赋值时，编译器会
 * 自动加转换代码，将基本数据类型变为包装类，或反之，
 * 使得我们在编写源代码时不再关注基本类型和包装类的转换工作。
 */
public class IntegerDemo3 {
    public static void main(String[] args) {

        int d = 123;
        /**
         * 自动装箱特性
         * 编译器会补充代码，将基本类型转为包装类
         * Integer i = Integer.valueOf(d);
         */
        Integer i = d;
        /**
         * 自动拆箱特性
         * 编译器将补充代码,将包装类0转换为基本类型
         * d = i.intValue();
         * * */
        d=i;
        System.out.println(i);
        System.out.println(d);
    }
}

package integer;

/***
 * 包装类案例
 *
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        System.out.println("imax"+imax);
        int imin = Integer.MIN_VALUE;
        System.out.println("imin"+imin);

        double dmax = Double.MAX_VALUE;
        System.out.println(dmax);
        /**
         * 包装类提供了一个静态方法parseXXX()
         * 可以将字符串解析为基本数据类型，但是前提是该字符串正确描述
         * 改基本类型存的值，否则抛出异常
         * NumberFormatException
         *
         *
         *
         */
        String line = "123";
        int in = Integer.parseInt(line);
        System.out.println(in);


    }
}

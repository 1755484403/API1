package object;

public class Test {
    public static void main(String[] args) {
        Point pp = new Point(222222,132223);
        Point p = new Point(54,66);
        String  str = pp.toString();
        /*
           toString  地址  类名.地址
        */
        String  sr = p.toString();
        System.out.println(str);
        System.out.println(sr);
        /*
            输出时转化
        * String ss = p.toString()
        * system.out.println(ss);
        * */
        System.out.println(p);


        /**
         * sout 自动调用toString 当输出不理想，重写toString方法
         */
        String line  = "这个是"+p;
        System.out.println(line);
        /**
         * Object 提供的方法equals
         * 该方法比较当前对象与参数对象的值是否相等 但如果不重写这方法
         *  默认 ==  全等于
         */
        Point p1 =new Point(54,66);
        System.out.println(p1.equals(p));
        /**
         * JAVA提供的基本类型基本都重写了toString和equals
         *
         * 只有我们自己定义的类需要重写
         */


    }
}

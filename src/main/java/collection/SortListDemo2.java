package collection;

import java.util.*;

/**
 * 排序自定义类型元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(66,6));
        list.add(new Point(8,2));
        list.add(new Point(1,8));
        list.add(new Point(8,1));
        list.add(new Point(8,3));
        list.add(new Point(18,8));
        list.add(new Point(2,2));
        list.add(new Point(18,25));
        list.add(new Point(14,25));
        System.out.println(list);
        /*
        该sort方法在排序是要求集合元素必须实现了Comparable接口，否则编译不通过
        当我们使用某个API的方法时，其要求我们为之改动其他地方的代码后才可以使用shi
        这种情况就具有侵略性，这不利于程序的后期维护
         */
//        Collections.sort(list);
        //Collections.sort();
        System.out.println(list);
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int olen1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int olen2=o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return olen1-olen2;
            }
        });
    }
}
//class MyComparator implements Comparator<Point>{
//    /**
//     *
//     * compare方法用于定义o1与o2比较daxiao的
//     */
//    public void
//}

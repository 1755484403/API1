package collection;

import sun.text.UCompactIntArray;

import java.util.*;

/**
 *
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("低分局");
        list.add("临时冻结");
        list.add("阿的回复");
        list.add("为");
        System.out.println(list);
//        Collections.sort(list);
        //按照字符多少排序
//        Collections.sort(list, (o1,o2)->o1.length()-o2.length());
        //降序
        Collections.sort(list, (o1,o2)->o2.length()-o1.length());
        System.out.println(list);

    }
}

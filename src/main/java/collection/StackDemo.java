package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，但是存取元素必须遵循先进后出原则
 * 使用栈通常用来完成如：后退，前进这样的功能使用
 *
 * Deque双端队列如果只调用从同一侧作出入队操作时，就形成了栈结构。因此双端队列也为栈结构提供
 * 了经典的两个方法：入栈push 出栈pop
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stact=new LinkedList<>();
        stact.push("one");
        stact.push("two");
        stact.push("three");
        stact.push("four");
        stact.push("five");
        System.out.println(stact);

        String str=stact.pop();
        System.out.println(str);
        System.out.println(stact);

        //使用新循环遍历
        for(String i:stact){
            System.out.println(i);
        }
        System.out.println(stact);

        //使用pop方法遍历
        while (stact.size()>0){
            str=stact.pop();
            System.out.println(str);
        }
        System.out.println(stact);


    }
}

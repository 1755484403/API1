package doc;

/**
 * 今天天气阴  文档注释只能用在三个地方：类上，方法上，常量上
 * 文档注释是功能性注释，在类上使用时是用来说明当前类的设计意图和整体功能
 * @author 夜猫子
 */
public class Demo {
    /**
     * sayHello用的问候语 什么是外包 我给你们
     */
    public static final String INFO = "你好";

    /**
     * 为指定的用户添加一个问候语
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "你好" + name;
    }



    public static void main(String[] args) {
        Demo deo = new Demo();
        deo.sayHello("www");
        System.out.println(3);
    }


}
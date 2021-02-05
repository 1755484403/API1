package String;

public class indexOfDemo {
    public static void main(String[] args) {
        String n ="thinking in java";
        int index = n.indexOf("in");//第一次出现
        System.out.println(index);

        index = n.indexOf("in",2);
        System.out.println(index);

        int in = n.indexOf("in",3);
        System.out.println(in);


        in = n.lastIndexOf("in");//最后一次出现
        System.out.println(in);


    }


}

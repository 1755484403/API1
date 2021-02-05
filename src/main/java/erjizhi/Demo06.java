package erjizhi;

public class Demo06 {
    public static void main(String[] args) {
        int n= -8;
        int m = 1;
        System.out.println(m);
        System.out.println(~m);

        System.out.println(~-100+1);
        System.out.println(~-100);

       /* System.out.println(Integer.toBinaryString(~n));
        System.out.println(Integer.toBinaryString(~n+1));*/
        n = Integer.MIN_VALUE;
        System.out.println(n);
        System.out.println(~n);
    }
}

package erjizhi;

public class Demo07 {
    public static void main(String[] args) {
        int m = 0x6e188fd5;
        int n = 0xff;
        int k = m&n;
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(k));
        System.out.println("-----------------------");
        int i = 0x5c5d43af;
        int j = i>>>8;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
    }
}

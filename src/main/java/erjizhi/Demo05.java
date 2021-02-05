package erjizhi;

/**
 * 整数的编码是环形的，最大值挨着最小值
 * 最大值加一等于最小值
 *
 *
 */
public class Demo05 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(max+1));
    }
}

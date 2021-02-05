package erjizhi;

import java.util.Random;

public class Demoo {
    public static void main(String[] args) {

        int n  = 50;
        Random ran =new Random();
        int i,k;
        System.out.println(Integer.toBinaryString(n));
        //  println(int) 把二进制转换为 整形 再输出

        for( i = 0;i<201;i++){
            System.out.println(Integer.toBinaryString(i)); }
        for(int j =0;j<20;j++){
                k =  ran.nextInt(201);
                System.out.println("******************************");
                System.out.println(Integer.toBinaryString(k));
        }




    }
}

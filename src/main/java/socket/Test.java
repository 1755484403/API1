package socket;

import java.util.Arrays;

/**
 * 测试从数组中删除指定元素
 */
public class Test {
    public static void main(String[] args) {
        int[] allOut={12,253,465,78,564,455,1,23,45};
        int pw=12;
        System.out.println(Arrays.toString(allOut));
        //将pw从数组allOut中删除
        for(int i=0;i<allOut.length;i++){
            if(allOut[i]==pw){
                allOut[i]=allOut[allOut.length-1];
                allOut=Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }
        System.out.println(Arrays.toString(allOut));
    }
}

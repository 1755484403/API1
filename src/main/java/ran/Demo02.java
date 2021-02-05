package ran;

/** 1111
 *
 */
public class Demo02 {
    public static void main(String[] args) {
 
        long b = 0xffffffff;
        System.out.println(b);

        int x =0x11;

        System.out.println(x);
        int a = -1;
        long aa= -1L;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Long.toBinaryString(aa));
        System.out.println("*****************");

        for(int i = -200;i<0;i++){
            System.out.println(Integer.toBinaryString(i));
        }
        
    }

}

/**
 * @outhor Rainbow
 * @date 2020/1/30 - 1:38 上午
 *
 * 
 * 体验====
 */
public class voerloadTest02 {
    public static void main(String[] args) {
        System.out.println (sum(1,2));
        System.out.println (sum(1.0 ,2.0));
        System.out.println (sum (1l, 2l));
    }

    public static int sum(int a , int b ) {
        return a + b ;

    }
    public static double sum(double a ,double b ){
        return a + b;
    }
    public static  long sum(long a ,long b){
        return a + b;

    }
}


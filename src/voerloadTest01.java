/**
 * @outhor Rainbow
 * @date 2020/1/30 - 12:51 上午
 */
public class voerloadTest01 {
    public static void main(String[] args) {
        int result1 = sumInt(1 ,2);
        System.out.println(result1);
        double result2 =sumDouble(1.0,2.0);
        System.out.println(result2);
        long result3 = sumLong( 1L, 2L );
        System.out.println(result3);
    }

    public static int sumInt(int a , int b ) {
        return a + b ;

    }
    public static double sumDouble(double a ,double b ){
        return a + b;
    }
    public static  long sumLong(long a ,long b){
        return a + b;

    }
}

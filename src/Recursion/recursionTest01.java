package Recursion;

/**
 *
 *
 *
 * 计算 1-n 的和
 */
public class recursionTest01 {
    public static void main(String[] args) {
        // 调用
        int n = 10;
        int s = sum(n);
        System.out.println( s );
    }
    public static int sum(int n){
        int result = 0;
        for (int i= 1; i <= n ; i++ ){
            result += i;
        }
        return result ;
    }
}

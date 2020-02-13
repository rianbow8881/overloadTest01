package Recursion;

/**
 *
 *
 * 递归计算 和  1-n
 *
 * 4+3+2+1  n 最初值是4
 */
public class recursionTest02 {

    public static void main(String[] args) {
        int n = 5;
        int s = recursionTest02.sum(n);
        System.out.println(s);
    }

    public static int sum(int n) {
        if (n == 1 ){
            return 1;
        }
        return n * sum(n-1);


    }




}

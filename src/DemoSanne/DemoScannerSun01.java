package DemoSanne;
//输入三个数字 求最大值
//使用 nextInt()方法
//调用三个nextInt()方法 得到三个int
//判断谁最大

import java.util.Scanner;

public class DemoScannerSun01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数字a");
        int a = sc.nextInt();
        System.out.println("第二个数字b");
        int b = sc.nextInt();
        System.out.println("第三个数字c");
        int c = sc.nextInt();
        //首先得到前两个数最大值
//        int temp = a > b ? a : b;
//        int max = temp > c ? temp : c;
//        System.out.println("最大的是"+ max);
        if (a > b) {
            if (a > c) {
                System.out.println(a + "是最大值a");
            } else {
                System.out.println(c + "是最大值c");
            }
        } else {    //b >= a
            if (b > c) {
                System.out.println(b + "是最大值b");
            } else {
                System.out.println(c + "是最大值c");
            }
        }
    }
}

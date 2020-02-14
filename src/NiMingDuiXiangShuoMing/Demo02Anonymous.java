package NiMingDuiXiangShuoMing;

import java.util.Scanner;

/**
 * @outhor Rainbow
 * @date 2020/2/14 - 8:29 下午
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc =new Scanner(System.in);
//        int num = sc.nextInt();
        //匿名方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("数字"+ num);
        //一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);
//       使用匿名对象来进行传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodResturn();
        int num = sc.nextInt();
        System.out.println("输出" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输出" + num);

    }

    public static Scanner methodResturn() {
//        Scanner sc = new Scanner();
//        return sc ;
        return new Scanner(System.in);


    }
}

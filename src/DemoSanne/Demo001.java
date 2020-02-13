package DemoSanne;

import java.util.Scanner;//导包

//获取键盘的一个输入 int数字    int num = sc.nextInt();
//                字符串      String str = sc.next();

public class Demo001 {
    public static void main(String[] args) {
        //创建
        Scanner sc = new Scanner(System.in); //   system.in是键盘输入
        //获取键盘输入
        int num = sc.nextInt();
        System.out.println("输入数字是"+ num );
        String str = sc.next();
        System.out.println("字符串是"+ str );

    }

}

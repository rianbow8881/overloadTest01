package RandomDemo;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100 ; i++) {//循环100次
            int num = r.nextInt(10);
            //重载  定义到数字0-9  左闭右开
            System.out.println(num);

        }
    }
}

package RandomDemo;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * 用代码模拟猜数字小游戏
 *      先要产生一个随机数字  并且一但产生不能变化Random
 *      需要键盘输入  用到 Scanner
 *      获取键盘输入数字 用Scanner 当中的nextInt方法
 *      已获得连个数字 判断 if 一下
 *      如果太大提示太大并且重试
 *      如果太小 提示太小 并且重试
 *      如果猜中 游戏结束
 *      重试 就是在来一次循环次数不定  用 while（true）
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(10) + 1;//「1，100」
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜的数字");
            int guessNum = sc.nextInt();  //输入猜的数字
            if (guessNum > random){
                System.out.println("太大了请重试");
            }else if (guessNum < random ){
                System.out.println("太小了请重试");
            }else {
                System.out.println("猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}

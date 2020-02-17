package RandomDemo;

import java.util.Random;
/**
 * 根据int 变量n的值 来获取随机数字  范围是【1，n】可以取到1 也可以取到n；
 * 思路
 *      1，定义一个int变量n 随意赋值
 *      2，要使用 Random 三个步骤  导包  创建  使用
 *      3，如果写10 那么就是0～9 然而想要到是 1～10 可以发现 整体+1 即可
 *      4，打印随机数字。
 */
public class Demo0 {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
       int result = r.nextInt(n) + 1 ;
        System.out.println(result);
    }
}

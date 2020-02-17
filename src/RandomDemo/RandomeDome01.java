package RandomDemo;

import java.util.Random;
/**
 * Random类 生成随机数
 * 1 导包
 * import java.util.Random;
 *
 * 2 创建
 * Random r = new Random;
 *
 * 3 使用
 *获取一个随机数字  int   （范围数int所有范围  有正负两种 int num = r.nxetInt（）；
 *                      参数代表范围   左闭右开 int num = r.nxetInt（3）；
 *                      代表的含有是 【 0 ，3 ）也就是 0～2
 */

public class RandomeDome01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
    }
}

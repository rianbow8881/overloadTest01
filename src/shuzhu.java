/**
 * @outhor Rainbow
 * @date 2020/1/31 - 1:11 下午
 */
public class shuzhu {
    public static void main(String[] args) {
        int [] k = new int[20];  //动态初始化数组 定义长度
        int [] m =new int[]{ 10, 20, 90 }; // 静态初始化数组 不定义长度但是在 {}内可以推算出长度
        int [] p = { 10, 20, 90 }; // 省略格式 静态初始化数组 不定义长度但是在 {}内可以推算出长度
/**
 *注意事项
 * 静态 使用省略格式就不能拆分两个 格式了
 *  建议  不确定内容用 动态
 *       确定内容了   用 静态
 */
        // 动态 静态  可以拆分两个格式
        int [] areyA;
        areyA = new int[]{ 10, 20,90 };
        //动态
        int []areyB;
        areyB =new int[20];




    }
}

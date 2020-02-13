package ShuZhu;

/**
 * @outhor Rainbow
 * @date 2020/1/31 - 1:27 下午
 *
 *
 *访问数组的格式 ； 数组名称「索引值」
 *索引值；就是一个int数字 代表数组当中元素对编号
 * 注意 ； 索引值 是从0开始 一直到 "数组长度-1" 为止
 */
public class shuzhu01 {
    public static void main(String[] args) {
        int[] l = {10,20 ,30};// o , 1, 2
        System.out.println(l); //[I@61bbe9ba  内存地址哈希值 16进制
        //直接打印数组
        System.out.println( l [0] );//10
        System.out.println( l [1] );//20
        System.out.println( l [2] );//30
// 数组 20 赋值给int lk变量
        int lk =l[1];
        System.out.println(lk);//20
/**
 *
 * 使用动态初始化数组时候 其中元素将拥有一个默认值
 *
 * 静态数组 也有默认值  只不过是 系统自动把默认值 替换成大括号内的具体数据
 *
 * 规则如下；
 *         如果是  整数  默认为；0
 *         如果是  浮点  类型  ；0.0
 *         如果是  字符  类型  ；'\u0000'
 *         如果是  布尔类型  默认； false
 *         如果是  引用类型  默认；null
 *
 */
        //动态初始化数组
        int [] mk =new int [3];
        System.out.println(mk);//内存地址哈希值
        System.out.println(mk[0]);//0
        System.out.println(mk[1]);//0
        System.out.println(mk[2]);//0

        //将数组123赋值给数组 mk 当中的一号元素
        mk[1] = 123;
/**
 *
 * 获取数值长度    数组名.length
 *
 */
        int [ ] lpk = {1,2,3,4,5,6,7,8,9,0,10};
        int lkm = lpk.length;
        System.out.println("数组长度是"+ lkm);





    }
}

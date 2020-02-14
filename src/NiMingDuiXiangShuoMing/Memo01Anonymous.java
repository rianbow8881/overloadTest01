package NiMingDuiXiangShuoMing;


/**
 * @outhor Rainbow
 * @date 2020/2/14 - 7:35 下午
 *
 * 创建对象的标准格式：
 * 类名称  对象名 = new 类名称（）;
 * 需要构造参数在小括号内 写上构造参数
 * 匿名对象就是只有 右边的对象 没有左边的名字 和复制运算符。
 * 格式：new 类名称();
 *注意：匿名对象只能使用唯一的一次  下次在用 不得不在创建一个新对象
 * 建议； 如果确定有一个对象只需要使用唯一的一次 就可以匿名对象。
 *
 *
 */


public class Memo01Anonymous {
    public static void main(String[] args) {
        //左边one 就是对象的名字
        Preson01 one = new Preson01();
        one.name = "张三";
        one.showName();

        //匿名对象
        new Preson01().name = "傻子";
        new Preson01().showName();// null

    }
}

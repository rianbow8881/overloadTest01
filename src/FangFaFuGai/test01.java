package FangFaFuGai;

/**
 * @outhor Rainbow
 * @date 2020/2/21 - 9:20 下午
 *
 *  方法覆盖被成为方法冲泻 英语单词 override/overwrite
 *  什么时候 使用方法重写
 *      当父类中当方法已经无法满足当前子类的业务需求
 *      子类有必要将父类中继承过来的方法进行重新编写
 *      这个重新编写的过程称为方法重写 /方法覆盖
 *
 *  什么条件满足后方法会发生重写   满足什么条件之后构成方法覆盖
 *      方法重写发生在具有继承关系父子类之间
 *      返回类型相同 方法明相同 刑参列表相同
 *      访问权限不能更底 可以更高
 *      抛出异常 不能更多 可以更少
 *
 * 建议 方法重写时候复制黏贴
 *
 * 注意
 *      私有方法不能继承 所以不能覆盖
 *      构造方法不能继承、、、、、、、
 *      静态方法不存在覆盖
 *      覆盖只针对方法 不谈属性
 *
 */


public class test01 {
    public static void main(String[] args) {
        //创建tst02 对象
        tst02 a = new tst02();
        a.move();
        //创建test03 对象
        test03 b = new test03();
        b.move();
        //创建test04 对象
        test04 c =new test04();
        c.move();

    }
}

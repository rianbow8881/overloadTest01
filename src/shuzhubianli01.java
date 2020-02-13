/**
 * @outhor Rainbow
 * @date 2020/1/31 - 4:03 下午
 *
 *
 *
 * 遍历数组 就是对数组当中对每一个元素 进行逐一的挨个处理 默认的方式就是打印输出
 *
 */
public class shuzhubianli01 {
    public static void main(String[] args) {
        int [] array = {15, 25, 30 ,35, 40 };
        //原始方式
        System.out.println(array[0]); //15
        System.out.println(array[1]); //25
        System.out.println(array[2]); //30
        System.out.println(array[3]); //35
        System.out.println(array[4]); //40
        System.out.println("==============================");
        //  使用循环 ，次数就是数组的长度
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============================");
        int qw = array.length;//   获取数组长度  进行赋值
        for (int j = 0 ; j < qw ; j++){
            System.out.println(array[j]);
        }
        System.out.println("=============================");
        for (int j = 0 ; j < array.length ; j++){ //  在for循环里直接进行获取 数组长度
            System.out.println(array[j]);
        }



    }
}

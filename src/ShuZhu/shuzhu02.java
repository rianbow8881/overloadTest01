package ShuZhu;

/**
 * @outhor Rainbow
 * @date 2020/1/31 - 1:27 下午
 */
public class shuzhu02 {
    public static void main(String[] args) {
        int[] l = {5, 15, 30, 20, 10000};
        int max = l[0];
        for (int i = 1; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println("最大的" + max);
    }
}


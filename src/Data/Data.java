package Data;

import java.security.PublicKey;

/**
 * @outhor Rainbow
 * @date 2020/2/10 - 8:03 下午
 */
public class Data {
    private int year;
    private int monte;
    private int day;

    public Data() {
        //    new Data(1970,2,2); 错误不能因为不能创建新的对象
         this(1970, 2, 2);//这种不会创建新的java对象  但是又可以达到调试其他的构造方法
//        this.year = 1970;
//        this.monte = 1;
//        this.day = 1;
    }

    public Data(int year, int monte, int day) {
        this.year = year;
        this.monte = monte;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonte() {
        return monte;
    }

    public void setMonte(int monte) {
        this.monte = monte;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void pr() {
        System.out.println(this.year + "年" + this.monte + "月" + this.day + "日");
    }
}







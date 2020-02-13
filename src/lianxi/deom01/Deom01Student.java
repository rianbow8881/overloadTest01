package lianxi.deom01;


public class Deom01Student {


    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("张三");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名"+ stu.getName());
        System.out.println("年龄"+ stu.getAge());
        System.out.println("是不是"+ stu.isMale());


    }
}

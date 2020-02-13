package lianxi.deom01;

/**
 * @outhor Rainbow
 * @date 2020/2/5 - 2:06 下午
 */
public class Student {
    private  String name ;//姓名
    private int age;//年龄
    private boolean male;//性别

    public void setMale(boolean b){
        male = b;
    }
    public  boolean isMale(){
        return male;
    }

    public  void  setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;

    }
}

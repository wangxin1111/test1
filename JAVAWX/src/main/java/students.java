/**
 * Created by Administrator on 2016/9/12.
 */
public class students {
    String name;
    int age;
    String grade;
    String hobbt;
    void show(){
        System.out.println(name + "年龄"+age + "就读于" + grade + hobbt+"篮球");
    }
    public static void main(String[] args){

        students stu = new students();
        stu.name = "张浩";
        stu.age = 10;
        stu.grade = "S1班";
        stu.hobbt = "篮球";
        stu.show();
    }


}

/**
 * Project name(项目名称)：继承
 * Package(包名): PACKAGE_NAME
 * Class(类名): People
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/9
 * Time(创建时间)： 23:15
 * Version(版本): 1.0
 * Description(描述)： 教师和学生都属于人，他们具有共同的属性：姓名、年龄、性别和身份证号，而学生还具有学号和所学专业两个属性，
 * 教师还具有教龄和所教专业两个属性。下面编写 Java 程序代码，使教师（Teacher）类和学生（Student）类都继承于人（People）类，具体的实现步骤如下。
 */

public class People
{
    public String name; // 姓名
    public int age; // 年龄
    public String sex; // 性别
    public String sn; // 身份证号

    public People(String name, int age, String sex, String sn)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.sn = sn;
    }

    public String toString()
    {
        return "姓名：" + name + "\n年龄：" + age + "\n性别：" + sex + "\n身份证号：" + sn;
    }
}

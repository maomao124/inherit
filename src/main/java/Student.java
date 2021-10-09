/**
 * Project name(项目名称)：继承
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/9
 * Time(创建时间)： 23:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student extends People
{
    private String stuNo; // 学号
    private String department; // 所学专业

    public Student(String name, int age, String sex, String sn, String stuno, String department)
    {
        super(name, age, sex, sn); // 调用父类中的构造方法
        this.stuNo = stuno;
        this.department = department;
    }

    public String toString()
    {
        return "姓名：" + name + "\n年龄：" + age + "\n性别：" + sex + "\n身份证号：" + sn +
                "\n学号：" + stuNo + "\n所学专业：" + department;
    }
}

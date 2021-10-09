/**
 * Project name(项目名称)：继承
 * Package(包名): PACKAGE_NAME
 * Class(类名): Teacher
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/9
 * Time(创建时间)： 23:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Teacher extends People
{
    private int tYear; // 教龄
    private String tDept; // 所教专业

    public Teacher(String name, int age, String sex, String sn, int tYear, String tDept)
    {
        super(name, age, sex, sn); // 调用父类中的构造方法
        this.tYear = tYear;
        this.tDept = tDept;
    }

    public String toString()
    {
        return "姓名：" + name + "\n年龄：" + age + "\n性别:" + sex + "\n身份证号：" + sn +
                "\n教龄：" + tYear + "\n所教专业：" + tDept;
    }
}

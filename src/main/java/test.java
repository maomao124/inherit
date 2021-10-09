/**
 * Project name(项目名称)：继承
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/9
 * Time(创建时间)： 23:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        // 创建Student类对象
        People stuPeople = new Student("王丽丽", 23, "女", "410521198902145589",
                "00001", "计算机应用与技术");
        System.out.println("----------------学生信息---------------------");
        System.out.println(stuPeople);
        // 创建Teacher类对象
        People teaPeople = new Teacher("张文", 30, "男", "410521198203128847",
                5, "计算机应用与技术");
        System.out.println("----------------教师信息----------------------");
        System.out.println(teaPeople);
    }
}

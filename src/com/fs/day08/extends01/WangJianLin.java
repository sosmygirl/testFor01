package com.fs.day08.extends01;
/*
* 继承
* 1.继承关键字 extends
* 2.ez为子 ，jianlin是父类
* 3. 继承只能单继承
* 4.继承要继承父类的 成员变量 成员方法
*   不能继承 父类的构造方法
* 5. 子类构造方法第一行默认有一个super();
* 6.继承的作用？
*    可以直接使用其他已有类的功能
*    将公共的字段与方法，抽取成一个父类
* 7.继承分类
*   直接继承 间接继承
* 8.重写（覆写）override
*   如果父类的方法不满足子类的需求，就可以覆写
*   方法签名相同，返回值类型可以不同
*   注意：
*   子类的访问权限不能比父类更低
*   static 修饰的方法不能重写（覆写）
* 9.object 类
*   是所有类的超类， 如果你没有继承任何父类，它默认你的父类
*   如果你继承了父类，它也是你间接继承的父类
*   object中的方法
*   toString 打印输出类的格式
*   equals 如果没有覆写比较两个地址是否相等
*   hashCode 哈希编码个内存中数据分配地址的 一般用于覆写
* 10. getclass 获得一个对象的真正的类型
*     Class class1 = jinalin.getClass();
*     class1 // 运行时对象
*
*
*  */
public class WangJianLin {
    private String age;
    boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public WangJianLin(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void money(){
        System.out.println("10个亿");
    }

}

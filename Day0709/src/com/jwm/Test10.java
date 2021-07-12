package com.jwm;

/**
 * 1、声明抽象父类Person，包含抽象方法public abstract void pee();
 * <p>
 * ​	2、声明子类Woman，重写抽象方法，打印坐着尿
 * <p>
 * ​	3、声明子类Man，重写抽象方法，打印站着上尿
 * <p>
 * ​	4、声明测试类Test10，创建Person数组，存放Woman和Man对象，并遍历数组，调用pee()方法
 */
public class Test10 {
    public static void main(String[] args) {
        Person[] person = {new Woman(), new Man()};
        for (Person p : person) {
            p.pee();
        }
    }
}

abstract class Person {
    public abstract void pee();
}

class Woman extends Person {
    @Override
    public void pee() {
        System.out.println("坐着尿尿");
    }
}

class Man extends Person {
    @Override
    public void pee() {
        System.out.println("站着尿尿");
    }
}
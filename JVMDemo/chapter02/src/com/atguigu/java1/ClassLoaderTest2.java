package com.atguigu.java1;


/**
 * @author shkstart
 * @create 2020 上午 10:59
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            //1.获取当前类的ClassLoader
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2.获取当前线程上下文的ClassLoader
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            //3.获取当前系统的ClassLoader
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

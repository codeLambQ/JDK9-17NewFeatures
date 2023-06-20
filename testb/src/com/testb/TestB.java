package com.testb;


import jdk.swing.interop.SwingInterOpUtils;

public class TestB {
    public static void main(String[] args) {
//        new Test2();  没有暴露出去所以不能引用
//        String s1 =
//                """
//                    {
//                        "name":"age"
//                    }
//                """; // 文本块
//
//        System.out.println(s1);

        // JDK 14 新特性 instanceof 增强
        Object a = "Hello";
        // 增强前写法
        if (a instanceof String) {
            String b = (String) a;
            System.out.println(b);
        }

        // 增强后
        if (a instanceof String b) {
            System.out.println(b);
        }
    }
}

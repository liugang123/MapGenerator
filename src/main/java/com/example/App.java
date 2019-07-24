package com.example;

/**
 * 入口函数
 */
public class App {
    public static void main(String[] args) {
        try {
            Generator generator = new Generator();
            generator.generate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MyBatis Generator Finished!");
    }
}

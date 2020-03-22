package com.test;

public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight,height);
        // 直接call已設計的建構子，但一定要在第一行
        this.name = name;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return  bmi;
    }
    public void hello() {
        System.out.println("Hello World!");
    }
}

package com.test;

public class Hello {
    public static void main(String[] args) {
//       System.out.println("Hello world!");
        Person p = new Person("test",66.5f, 1.7f);
        p.hello();
        /*int age = 19;
        Integer age2 = 19;
        char c = 't';
        Character c2 = 't';
        byte b = 120;
        Byte b2 = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        String name = "test";*/

//        p.weight = 66.5f;
//        p.height = 1.7f;
        System.out.println(p.bmi());


    }
}

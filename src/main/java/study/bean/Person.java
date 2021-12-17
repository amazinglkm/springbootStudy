package study.bean;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;
    private Pet pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package com.my.common.entity;

/**
 * 实体
 *
 * @author feb13th
 * @since 2019/4/11 20:02
 */
public class Person {

    /* id */
    private String id;
    /* 名字 */
    private String name;
    /* 年龄 */
    private int age;


    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

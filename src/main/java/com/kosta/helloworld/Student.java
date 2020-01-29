package com.kosta.helloworld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
    @Id @Column
    private String name;
    @Column
    private int age;

    public void cleaning()
    {
        System.out.println(name + ": Yes, I'm cleaning :(");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

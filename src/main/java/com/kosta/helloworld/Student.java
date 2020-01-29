package com.kosta.helloworld;

import javax.persistence.*;

@Entity
public class Student
{

    @Id @Column @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;
    @Column
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


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

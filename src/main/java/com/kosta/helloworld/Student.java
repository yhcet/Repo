package com.kosta.helloworld;

import javax.persistence.*;
import java.util.List;

@Entity (name="student")
public class Student
{

    @Id @Column @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;
    @Column
    private int age;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<Clazz> clazzes;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<OrderInformation> orderInformations;


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

    public List<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(List<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    public List<OrderInformation> getOrderInformations() {
        return orderInformations;
    }

    public void setOrderInformations(List<OrderInformation> orderInformations) {
        this.orderInformations = orderInformations;
    }
}

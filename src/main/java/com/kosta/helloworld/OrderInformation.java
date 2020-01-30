package com.kosta.helloworld;

import javax.persistence.*;
import java.util.List;

@Entity  (name="orderinformation")
public class OrderInformation {
    @Id @GeneratedValue
    private long id;
    private int count;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Product product;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

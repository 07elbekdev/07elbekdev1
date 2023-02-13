package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "president")
public class President {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    private int age;

    public President() {
    }

    public President(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}


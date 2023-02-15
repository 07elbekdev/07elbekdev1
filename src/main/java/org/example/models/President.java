package org.example.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "president")
@Data
@ToString
public class President {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    private int age;

    @OneToOne(mappedBy = "president",cascade = CascadeType.ALL)
    private Company company;

    public President() {
    }

    public President(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
package com.viettel.vssfood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "public")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(100)")
    private String foodName;

    private Double averageVote;

    private String description;

    private Double price;

    private Integer categoryId;

    private Integer status;
}

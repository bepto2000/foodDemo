package com.viettel.vssfood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "public")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer foodId;

    private Integer ingredientId;

    private Integer quantity;

    private String unit;
}

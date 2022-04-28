package com.viettel.vssfood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "public")
public class ComboFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer comboId;

    private Integer foodId;
}

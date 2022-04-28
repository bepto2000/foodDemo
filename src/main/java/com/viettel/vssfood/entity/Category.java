package com.viettel.vssfood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "public")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(20)")
    private String categoryCode;

    private String categoryName;

    private Date createdDate;

    private Date modifiedDate;

    private Boolean isDelete;
}

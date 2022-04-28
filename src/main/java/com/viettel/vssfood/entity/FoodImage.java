package com.viettel.vssfood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "public")
public class FoodImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String thumbnail;

    private String path;

    private Date createdDate;

    private Date modifiedDate;

    private Boolean isDelete;

    private Integer foodId;
}

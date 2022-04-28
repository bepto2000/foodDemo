package com.viettel.vssfood.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "public")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer productId;

    private Integer productType;

    private String title;

    private Integer discountPercent;

    private Integer discountValue;

    private Date startDate;

    private Date endDate;

    private Integer status;

    private String description;

    private Date createdDate;

    private Date modifiedDate;
}

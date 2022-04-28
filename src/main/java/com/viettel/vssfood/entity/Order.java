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
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(20)")
    private String orderCode;

    private Date orderDate;

    private Integer status;

    private Date updatedTime;

    private String description;

    private Double price;

    private String address;

    @Column(columnDefinition = "varchar(20)")
    private String phoneNumber;

    private Date completeAt;

    private String customerName;

    private Integer userId;

    private Integer voucherId;
}

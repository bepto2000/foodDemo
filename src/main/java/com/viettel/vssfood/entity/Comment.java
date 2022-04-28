package com.viettel.vssfood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "public")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double vote;

    private String comment;

    private String image;

    private Date createdDate;

    private Date modifiedDate;

    private Integer foodId;

    private Integer orderId;
}

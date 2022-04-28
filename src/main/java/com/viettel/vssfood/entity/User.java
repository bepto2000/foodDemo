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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    private String email;

    @Column(columnDefinition = "varchar(20)")
    private String phoneNumber;

    private String address;

    @Column(columnDefinition = "varchar(150)")
    private String username;

    @Column(columnDefinition = "varchar(150)")
    private String password;

    private Date createdAt;

    private Integer roleId;

    private Integer status;
}

package com.viettel.vssfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoodDto {

    private String foodName;

    private Double averageVote;

    private String description;

    private Double price;

    private String categoryName;

    private Integer status;
}

package com.viettel.vssfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PromotionDto {
    private Integer productId;

    private Integer productType;

    private String title;

    private Integer discountPercent;

    private Integer discountValue;

    private Date startDate;

    private Date endDate;

    private Integer status;

    private String description;
}

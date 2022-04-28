package com.viettel.vssfood.mapper;

import com.viettel.vssfood.dto.PromotionDto;
import com.viettel.vssfood.entity.Promotion;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PromotionMapper {
    public List<PromotionDto> toDto(List<Promotion> promotionList) {
        List<PromotionDto> promotionDtoList = new ArrayList<>();
        for (Promotion promotion : promotionList) {
            promotionDtoList.add(toDto(promotion));
        }
        return promotionDtoList;
    }

    public PromotionDto toDto(Promotion promotion) {
        PromotionDto dto= new PromotionDto();
        dto.setProductId(promotion.getProductId());
        dto.setProductType(promotion.getProductType());
        dto.setTitle(promotion.getTitle());
        dto.setDiscountPercent(promotion.getDiscountPercent());
        dto.setDiscountValue(promotion.getDiscountValue());
        dto.setStartDate(promotion.getStartDate());
        dto.setEndDate(promotion.getEndDate());
        dto.setStatus(promotion.getStatus());
        dto.setDescription(promotion.getDescription());
        return dto;
    }

    public Promotion toEntity(PromotionDto dto, Date createdDate, Date modifiedDate) {
        Promotion promotion = new Promotion();
        promotion.setProductId(dto.getProductId());
        promotion.setProductType(dto.getProductType());
        promotion.setTitle(dto.getTitle());
        promotion.setDiscountPercent(dto.getDiscountPercent());
        promotion.setDiscountValue(dto.getDiscountValue());
        promotion.setStartDate(dto.getStartDate());
        promotion.setEndDate(dto.getEndDate());
        promotion.setStatus(dto.getStatus());
        promotion.setDescription(dto.getDescription());
        promotion.setCreatedDate(createdDate);
        promotion.setModifiedDate(modifiedDate);
        return promotion;
    }
}

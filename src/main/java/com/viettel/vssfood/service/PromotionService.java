package com.viettel.vssfood.service;

import com.viettel.vssfood.dto.PromotionDto;

import java.util.List;

public interface PromotionService {
    List<PromotionDto> getAllPromotion();

    List<PromotionDto> getPromotionByCategory(String category);

    Integer addPromotion(PromotionDto promotionDto);
}

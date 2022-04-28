package com.viettel.vssfood.service.impl;

import com.viettel.vssfood.dto.PromotionDto;
import com.viettel.vssfood.entity.Promotion;
import com.viettel.vssfood.mapper.PromotionMapper;
import com.viettel.vssfood.repository.PromotionRepository;
import com.viettel.vssfood.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    PromotionRepository promotionRepository;

    @Autowired
    PromotionMapper promotionMapper;

    public List<PromotionDto> getAllPromotion() {
        return promotionMapper.toDto(promotionRepository.findAll());
    }

    public List<PromotionDto> getPromotionByCategory(String category) {
        return promotionMapper.toDto(promotionRepository.getPromotionByCategory(category));
    }

    public Integer addPromotion(PromotionDto promotionDto) {
        Promotion promotion = promotionMapper.toEntity(promotionDto, new Date(), null);
        promotionRepository.save(promotion);
        return promotion.getId();
    }
}

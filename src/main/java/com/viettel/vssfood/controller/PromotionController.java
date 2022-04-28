package com.viettel.vssfood.controller;

import com.viettel.vssfood.dto.PromotionDto;
import com.viettel.vssfood.service.impl.PromotionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PromotionController {
    @Autowired
    PromotionServiceImpl promotionService;

    @GetMapping("/promotion/all")
    public List<PromotionDto> getAllPromotion() {
        return promotionService.getAllPromotion();
    }

    @GetMapping("/promotion/{category}")
    public List<PromotionDto> getPromotionByCategory(@PathVariable String category) {
        return promotionService.getPromotionByCategory(category);
    }

    @PostMapping("/promotion")
    public Integer addPromotion(@RequestBody PromotionDto promotionDto) {
        return promotionService.addPromotion(promotionDto);
    }
}

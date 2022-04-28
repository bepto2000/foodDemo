package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
    @Query(value = "select p from Promotion p where p.productType in (select c.id from Category c where c.categoryName = :category)")
    List<Promotion> getPromotionByCategory(String category);
}

package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.FoodImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodImageRepository extends JpaRepository<FoodImage,Integer> {
}

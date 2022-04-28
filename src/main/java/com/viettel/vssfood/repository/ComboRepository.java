package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboRepository extends JpaRepository<Combo,Integer> {
}

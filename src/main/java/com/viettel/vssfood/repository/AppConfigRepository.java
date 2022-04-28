package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.AppConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppConfigRepository extends JpaRepository<AppConfig,Integer> {
}
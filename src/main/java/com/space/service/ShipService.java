package com.space.service;

import com.space.model.Ship;
import com.space.model.ShipType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Map;

public interface ShipService {

    List<Ship> findAll(Pageable pageable);
    List<Ship> findByParams(Map<String, String> params);

    Ship add(Map<String, String> params);

    Ship get(Long id);
    Ship update(Long id, Map<String, String> params);
    String deleteById(Long id);

    Integer countByParams(Map<String, String> params);
    Integer count();
    Ship findById(Long id);
    boolean existsById(Long id);
    boolean isIdValid(Long id);
    boolean isParamsValid(Map<String, String> params);
    boolean isAllParamsFound(Map<String, String> params);
}

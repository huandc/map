package com.huan.map.mapper;

import com.huan.map.model.RadiationMeasurement;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 郇冲
 * @Date 2021/9/5
 */
@Mapper
@Repository
public interface RadiationMeasurementMapper {
    List<RadiationMeasurement> findAll();
}

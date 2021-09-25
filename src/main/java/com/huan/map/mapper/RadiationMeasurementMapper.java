package com.huan.map.mapper;

import com.huan.map.model.RadiationMeasurement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    int addRadiationMeasurement(@Param("address") String address, @Param("distance") Integer distance,
                                @Param("average") Double average, @Param("powerDensity") Double powerDensity,
                                @Param("provider") String provider);

    int deleteRadiationMeasurement(@Param("address") String address);
}

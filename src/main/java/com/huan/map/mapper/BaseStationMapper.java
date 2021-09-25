package com.huan.map.mapper;

import com.huan.map.model.BaseStation;
import com.huan.map.model.dto.BaseStationRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 郇冲
 * @Date 2021/9/4
 */
@Mapper
@Repository
public interface BaseStationMapper {
    List<BaseStation> findAll();

    int addBaseStation(BaseStationRequestDTO baseStationRequestDTO);

    int deleteBaseStation(@Param("id") Integer id, @Param("latitude") Double latitude, @Param("longitude") Double longitude);
}

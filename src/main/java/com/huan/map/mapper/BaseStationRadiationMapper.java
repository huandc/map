package com.huan.map.mapper;

import com.huan.map.model.BaseStationRadiation;
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
public interface BaseStationRadiationMapper {
    List<BaseStationRadiation> findAll();

    List<BaseStationRadiation> findOneByLatAndLong(double latitude, double longitude);


    List<BaseStationRadiation> findOneByAllParameters(Double latitude, Double longitude, Integer distance, String provider);

    List<BaseStationRadiation> getBaseStationRadiation(Double latitude, Double longitude, Integer distance, String provider);

    List<BaseStationRadiation> listAllBaseStationRadiation(Integer start,Integer end);

    int addBaseStationRadiation(BaseStationRadiation baseStationRadiation);

    int deleteBaseStationRadiation(@Param("id") int id);

    BaseStationRadiation findById(@Param("id") int id);

    int updateBaseStationRadiation(BaseStationRadiation baseStationRadiation);

    int count();
}

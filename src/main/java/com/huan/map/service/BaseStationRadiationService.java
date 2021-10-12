package com.huan.map.service;

import com.huan.map.model.BaseStationRadiation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基站位置和辐射水平
 *
 * @author yan
 * @date 2021/9/26
 */
public interface BaseStationRadiationService {
    int syncBaseStationRadiation();

    List<BaseStationRadiation> findAll();

    List<BaseStationRadiation> findOneByLatAndLong(double latitude, double longitude);


    List<BaseStationRadiation> findOneByAllParameters(Double latitude, Double longitude, Integer distance, String provider);

    List<BaseStationRadiation> getBaseStationRadiation(Double latitude, Double longitude, Integer distance, String provider);

    List<BaseStationRadiation> listAllBaseStationRadiation(Integer pageNo,Integer size);

    int addBaseStationRadiation(BaseStationRadiation baseStationRadiation);

    int deleteBaseStationRadiation(@Param("id") int id);
}

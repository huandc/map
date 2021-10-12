package com.huan.map.service.impl;

import com.huan.map.Exception.ValidateException;
import com.huan.map.mapper.BaseStationRadiationMapper;
import com.huan.map.model.BaseStationRadiation;
import com.huan.map.service.BaseStationRadiationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 基站位置和辐射水平
 *
 * @author yan
 * @date 2021/9/26
 */
@Service
public class BaseStationRadiationServiceImpl implements BaseStationRadiationService {

    @Resource
    private BaseStationRadiationMapper BaseStationRadiationMapper;

    @Resource
    private BaseStationRadiationMapper baseStationRadiationMapper;


    @Override
    public int syncBaseStationRadiation() {
        int effectRows = 0;
        List<BaseStationRadiation> baseStationRadiationList = BaseStationRadiationMapper.findAll();
        if (baseStationRadiationList.isEmpty()) {
            return effectRows;
        }
        for (BaseStationRadiation baseStationRadiation : baseStationRadiationList) {
            List<BaseStationRadiation> stationRadiation = baseStationRadiationMapper.getBaseStationRadiation(
                    baseStationRadiation.getLatitude(), baseStationRadiation.getLongitude(),
                    baseStationRadiation.getDistance(), baseStationRadiation.getProvider());
            if (stationRadiation.size() > 0) {
                continue;
            }
            effectRows += baseStationRadiationMapper.addBaseStationRadiation(baseStationRadiation);
        }
        return effectRows;
    }

    @Override
    public List<BaseStationRadiation> findAll() {
        return baseStationRadiationMapper.findAll();
    }

    @Override
    public List<BaseStationRadiation> findOneByLatAndLong(double latitude, double longitude) {
        if (Objects.isNull(latitude) || Objects.isNull(longitude)) {
            throw new ValidateException("latitude and longitude must is null");
        }
        return baseStationRadiationMapper.findOneByLatAndLong(latitude, longitude);
    }

    @Override
    public List<BaseStationRadiation> findOneByAllParameters(Double latitude, Double longitude, Integer distance, String provider) {
        return baseStationRadiationMapper.findOneByAllParameters(latitude, longitude, distance, provider);
    }

    @Override
    public List<BaseStationRadiation> getBaseStationRadiation(Double latitude, Double longitude, Integer distance, String provider) {
        return baseStationRadiationMapper.getBaseStationRadiation(latitude, longitude, distance, provider);
    }

    @Override
    public List<BaseStationRadiation> listAllBaseStationRadiation(Integer pageNo, Integer size) {
        Integer start = (pageNo - 1) * size;
        Integer end = start + size;
        return baseStationRadiationMapper.listAllBaseStationRadiation(start, end);
    }

    @Override
    public int addBaseStationRadiation(BaseStationRadiation baseStationRadiation) {
        if (Objects.isNull(baseStationRadiation)) {
            throw new ValidateException("baseStationRadiation is null");
        }
        if (Objects.isNull(baseStationRadiation.getLatitude())) {
            throw new ValidateException("baseStationRadiation.getLatitude is null");
        }
        if (Objects.isNull(baseStationRadiation.getLongitude())) {
            throw new ValidateException("baseStationRadiation.getLongitude is null");
        }
        if (Objects.isNull(baseStationRadiation.getDistance())) {
            throw new ValidateException("baseStationRadiation.getDistance is null");
        }
        if (Objects.isNull(baseStationRadiation.getProvider())) {
            throw new ValidateException("baseStationRadiation.getProvider is null");
        }
        if (Objects.isNull(baseStationRadiation.getPowerDensity())) {
            throw new ValidateException("baseStationRadiation.getPowerDensity is null");
        }

        return baseStationRadiationMapper.addBaseStationRadiation(baseStationRadiation);
    }

    @Override
    public int deleteBaseStationRadiation(int id) {
        return baseStationRadiationMapper.deleteBaseStationRadiation(id);
    }
}

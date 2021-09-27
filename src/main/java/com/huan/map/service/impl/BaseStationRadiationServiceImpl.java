package com.huan.map.service.impl;

import com.huan.map.mapper.BaseStationRadiationMapper;
import com.huan.map.model.BaseStationRadiation;
import com.huan.map.service.BaseStationRadiationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
                    baseStationRadiation.getDistance(), baseStationRadiation.getAverage(),
                    baseStationRadiation.getPowerDensity(), baseStationRadiation.getProvider());
            if (stationRadiation.size() > 0) {
                continue;
            }
            effectRows += baseStationRadiationMapper.addBaseStationRadiation(baseStationRadiation);
        }
        return effectRows;
    }
}

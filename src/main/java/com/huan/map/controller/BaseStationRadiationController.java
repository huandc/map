package com.huan.map.controller;

import com.huan.map.mapper.BaseMapper;
import com.huan.map.mapper.RadiationMeasurementMapper;
import com.huan.map.model.Base;
import com.huan.map.model.dto.BaseStationRadiationRequestDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * BaseStationRadiation
 *
 * @author yan
 * @date 2021/9/24
 */
@Api(tags = "基站辐射(BaseStationRadiation)")
@RestController
@RequestMapping("/base/station/radiation")
public class BaseStationRadiationController {

    @Resource
    private BaseMapper baseMapper;

    @Resource
    private RadiationMeasurementMapper radiationMeasurementMapper;

    @ApiOperation("新增基站辐射")
    @PostMapping("/add")
    public int addBaseStationRadiation(@ApiParam(name = "BaseStationRadiationRequestDTO", value = "基站辐射", required = true)
                                       @RequestBody BaseStationRadiationRequestDTO requestDTO) {
        int effect = 0;
        Base base = baseMapper.getBase(requestDTO.getAddress(), requestDTO.getLatitude(), requestDTO.getLongitude());
        if (Objects.isNull(base)) {
            effect += baseMapper.addBase(requestDTO.getAddress(), requestDTO.getLatitude(), requestDTO.getLongitude());
        } else {
            effect += baseMapper.updateBase(requestDTO.getAddress(), requestDTO.getLatitude(), requestDTO.getLongitude());
        }
        effect += radiationMeasurementMapper.addRadiationMeasurement(requestDTO.getAddress(), requestDTO.getDistance(),
                requestDTO.getAverage(), requestDTO.getPowerDensity(), requestDTO.getProvider());
        return effect;
    }

    @ApiOperation("删除基站辐射")
    @PostMapping("/delete")
    public int deleteBaseStationRadiation(@ApiParam(name = "latitude", value = "经度") @RequestParam Double latitude,
                                          @ApiParam(name = "longitude", value = "纬度") @RequestParam Double longitude) {
        int effect = 0;
        Base base = baseMapper.getBase(null, latitude, longitude);
        effect += radiationMeasurementMapper.deleteRadiationMeasurement(base.getAddress());
        effect += baseMapper.deleteBase(latitude, longitude);
        return effect;
    }
}

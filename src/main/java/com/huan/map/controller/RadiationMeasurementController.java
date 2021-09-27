package com.huan.map.controller;

import com.huan.map.mapper.RadiationMeasurementMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 辐射测量
 *
 * @author yan
 * @date 2021/9/26
 */
@Api(tags = "辐射测量radiation_measurement")
@RestController
@RequestMapping("/radiation/measurement")
public class RadiationMeasurementController {

    @Resource
    private RadiationMeasurementMapper radiationMeasurementMapper;

    @ApiOperation("新增辐射测量")
    @GetMapping("/add")
    public int addBase(@ApiParam(name = "address", value = "地址") @RequestParam String address,
                       @ApiParam(name = "distance", value = "距离基站中心水平距离") @RequestParam Integer distance,
                       @ApiParam(name = "average", value = "平均值") @RequestParam Double average,
                       @ApiParam(name = "powerDensity", value = "功率密度") @RequestParam Double powerDensity,
                       @ApiParam(name = "provider", value = "运营商") @RequestParam String provider) {
        return radiationMeasurementMapper.addRadiationMeasurement(address, distance, average, powerDensity, provider);
    }

    @ApiOperation("删除辐射测量")
    @PostMapping("/delete")
    public int deleteBase(@ApiParam(name = "address", value = "地址") @RequestParam String address) {
        return radiationMeasurementMapper.deleteRadiationMeasurement(address);
    }
}

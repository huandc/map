package com.huan.map.controller;

import com.huan.map.mapper.BaseStationRadiationMapper;
import com.huan.map.model.BaseStationRadiation;
import com.huan.map.service.BaseStationRadiationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    private BaseStationRadiationMapper baseStationRadiationMapper;

    @Resource
    private BaseStationRadiationService baseStationRadiationService;

    @ApiOperation("新增基站辐射")
    @PostMapping("/add")
    public int addBaseStationRadiation(@ApiParam(name = "BaseStationRadiation", value = "基站辐射", required = true)
                                       @RequestBody BaseStationRadiation requestDTO) {
        return baseStationRadiationMapper.addBaseStationRadiation(requestDTO);
    }

    @ApiOperation("删除基站辐射")
    @PostMapping("/delete")
    public int deleteBaseStationRadiation(@ApiParam(name = "latitude", value = "经度") @RequestParam Double latitude,
                                          @ApiParam(name = "longitude", value = "纬度") @RequestParam Double longitude) {
        return baseStationRadiationMapper.deleteBaseStationRadiation(latitude, longitude);
    }

    @ApiOperation("从radiation_measurement和base刷新数据到base_station_radiation")
    @GetMapping("/sync")
    public int syncBaseStationRadiation() {
        return baseStationRadiationService.syncBaseStationRadiation();
    }
}

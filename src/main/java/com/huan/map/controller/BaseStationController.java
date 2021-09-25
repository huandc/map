package com.huan.map.controller;

import com.huan.map.mapper.BaseStationMapper;
import com.huan.map.model.dto.BaseStationRequestDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * BaseStation
 *
 * @author yan
 * @date 2021/9/24
 */
@Api(tags = "基站信息表(base_station)")
@RestController
@RequestMapping("/base/station")
public class BaseStationController {

    @Resource
    private BaseStationMapper baseStationMapper;

    @ApiOperation("新增基站信息")
    @PostMapping("/add")
    public int addBaseStation(@ApiParam(name = "baseStationRequestDTO", value = "BaseStationDTO", required = true)
                              @RequestBody BaseStationRequestDTO baseStationRequestDTO) {
        return baseStationMapper.addBaseStation(baseStationRequestDTO);
    }

    @ApiOperation("删除基站信息")
    @PostMapping("/delete")
    public int deleteBaseStation(@ApiParam(name = "id", value = "主键id") @RequestParam(required = false) Integer id,
                                 @ApiParam(name = "latitude", value = "经度") @RequestParam Double latitude,
                                 @ApiParam(name = "longitude", value = "纬度") @RequestParam Double longitude) {
        return baseStationMapper.deleteBaseStation(id, latitude, longitude);
    }
}

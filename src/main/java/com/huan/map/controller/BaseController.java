package com.huan.map.controller;

import com.huan.map.mapper.BaseMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 基站
 *
 * @author yan
 * @date 2021/9/26
 */
@Api(tags = "基站信息表(base)")
@RestController
@RequestMapping("/base")
public class BaseController {
    @Resource
    private BaseMapper baseMapper;

    @ApiOperation("新增基站")
    @GetMapping("/add")
    public int addBase(@ApiParam(name = "address", value = "地址") @RequestParam String address,
                       @ApiParam(name = "latitude", value = "经度") @RequestParam Double latitude,
                       @ApiParam(name = "longitude", value = "纬度") @RequestParam Double longitude) {
        return baseMapper.addBase(address, latitude, longitude);
    }

    @ApiOperation("删除基站")
    @PostMapping("/delete")
    public int deleteBase(@ApiParam(name = "latitude", value = "经度") @RequestParam Double latitude,
                          @ApiParam(name = "longitude", value = "纬度") @RequestParam Double longitude) {
        return baseMapper.deleteBase(latitude, longitude);
    }
}

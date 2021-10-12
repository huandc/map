package com.huan.map.controller;

import com.huan.map.model.BaseStationRadiation;
import com.huan.map.service.BaseStationRadiationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郇冲
 * @Date 2021/8/31
 */

@org.springframework.stereotype.Controller
@ResponseBody
//@RequestMapping("/base/station/radiation")
@Api(tags = "电信数据基站")
public class Controller {

    @Resource
    private BaseStationRadiationService baseStationRadiationService;

    @RequestMapping("/")
    @ApiOperation("测试")
    public String test() {
        return "Hello";
    }

    @RequestMapping("/index")
    @ApiOperation("index")
    public String index() {
        return "index";
    }

    //返回所有基站的辐射
    @ApiOperation("获取所有基站的辐射")
    @RequestMapping("/showAll")
    public List<BaseStationRadiation> showAll() {
        return baseStationRadiationService.findAll();
    }


    //按照参数返回该基站的辐射
    //http://localhost:8080/show?latitude=30.47331&longitude=114.276532&distance=10&provider=%中国电信
    @ApiOperation("获取所有基站的辐射根据具体参数")
    @RequestMapping("/show")
    public List<BaseStationRadiation> showOne(@RequestParam(value = "latitude", defaultValue = "0") Double latitude,
                                              @RequestParam(value = "longitude", defaultValue = "0") Double longitude,
                                              @RequestParam(value = "distance", defaultValue = "0") Integer distance,
                                              @RequestParam(value = "provider", defaultValue = "") String provider) {

        return baseStationRadiationService.findOneByAllParameters(latitude, longitude, distance, provider);
    }

}

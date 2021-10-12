package com.huan.map;

import com.huan.map.controller.BaseStationRadiationController;
import com.huan.map.mapper.BaseStationMapper;
import com.huan.map.mapper.BaseStationRadiationMapper;
import com.huan.map.mapper.RadiationMeasurementMapper;
import com.huan.map.model.BaseStation;
import com.huan.map.model.BaseStationRadiation;
import com.huan.map.model.RadiationMeasurement;
import com.huan.map.model.dto.PageBaseStationRadiation;
import com.huan.map.service.BaseStationRadiationService;
import com.huan.map.service.UserService;
import com.huan.map.util.MD5Utils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
class MapApplicationTests {

    @Test
    void contextLoads() {
    }


    @Resource
    private UserService userService;

    @Resource
    private BaseStationRadiationService baseStationRadiationService;

    @Test
    public void user(){
        int total = baseStationRadiationService.count();
        System.out.println(total);

    }

    @Resource
    private BaseStationMapper baseStationMapper;

    @Test
    public void getAllBaseStation(){

        List<BaseStation> all = baseStationMapper.findAll();
        all.forEach(
                System.out::println
        );
    }

    @Resource
    private RadiationMeasurementMapper radiationMeasurementMapper;

    @Test
    public void getAllRadiationMeasurement(){

        List<RadiationMeasurement> all = radiationMeasurementMapper.findAll();
        System.out.println("all = " + all.size());
        all.forEach(
                System.out::println
        );
    }


    @Resource
    private BaseStationRadiationMapper baseStationRadiationMapper;

    @Test
    public void getAllBaseStationRadiation(){

//        List<BaseStationRadiation> all = baseStationRadiationMapper.findAll();
//        all.forEach(
//                System.out::println
//        );

        List<BaseStationRadiation> list = baseStationRadiationMapper.findOneByLatAndLong(30.47331, 114.276532);

        list.forEach(
                System.out::println
        );
    }


}

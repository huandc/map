package com.huan.map.model;

import lombok.Data;

/**
 * @author 郇冲
 * @Date 2021/8/31
 */
@Data
public class RadiationMeasurement {
    int id;
    BaseStation baseStation; //基站
    int distance; //距离基站中心水平距离
    double average; //平均值
    double powerDensity;//功率密度
    String provider; //运营商/
}

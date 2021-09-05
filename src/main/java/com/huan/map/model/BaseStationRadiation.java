package com.huan.map.model;

import lombok.Data;

/**
 * 基站位置和辐射水平
 * @author 郇冲
 * @Date 2021/9/5
 */
@Data
public class BaseStationRadiation {
    double latitude; //纬度
    double longitude; //经度
    int distance; //距离基站中心水平距离
    double average; //平均值
    double powerDensity;//功率密度
    String provider; //运营商
}

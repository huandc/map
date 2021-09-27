package com.huan.map.model;

import lombok.Data;

/**
 * 基站位置和辐射水平
 *
 * @author 郇冲
 * @Date 2021/9/5
 */
@Data
public class BaseStationRadiation {
    Integer id;
    Double latitude; //纬度
    Double longitude; //经度
    Integer distance; //距离基站中心水平距离
    Double average; //平均值
    Double powerDensity;//功率密度
    String provider; //运营商
}

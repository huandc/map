package com.huan.map.model;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author 郇冲
 * @Date 2021/8/31
 */
@Data
public class RadiationMeasurement {
    Integer id;
    BaseStation baseStation; //基站
    Integer distance; //距离基站中心水平距离
    Double average; //平均值
    Double powerDensity;//功率密度
    String provider; //运营商/
}

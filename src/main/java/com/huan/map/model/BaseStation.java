package com.huan.map.model;

import lombok.Data;

/**
 * @author 郇冲
 * @Date 2021/8/31
 */
@Data
public class BaseStation {
    Integer id;
    Double latitude; //纬度
    Double longitude; //经度
    String name;  //基站名称
    String address; //地址
    String high; //离地高度
    String type; //天线支架类型
    Integer nums; //天线数量
    String status; //运行状态
    String model;//发射机型号
    String antenna;//天线下倾角（机械下倾角+电子下倾角）
    String region; //区域
}

package com.huan.map.model;

import lombok.Data;

/**
 * @author 郇冲
 * @Date 2021/8/31
 */
@Data
public class Base {
    int id;
    double latitude; //纬度
    double longitude; //经度
    String address; //地址
}

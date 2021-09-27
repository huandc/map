package com.huan.map.model;

import lombok.Data;

/**
 * @author 郇冲
 * @Date 2021/8/31
 */
@Data
public class Base {
    Integer id;
    Double latitude; //纬度
    Double longitude; //经度
    String address; //地址
}

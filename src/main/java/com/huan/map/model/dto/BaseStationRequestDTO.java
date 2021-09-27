package com.huan.map.model.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * BaseStationDTO
 *
 * @author yan
 * @date 2021/9/24
 */
public class BaseStationRequestDTO {

    @ApiModelProperty(hidden = true)
    private int id;
    /**
     * 纬度
     */
    @ApiModelProperty("纬度")
    private Double latitude; //纬度
    /**
     * 经度
     */
    @ApiModelProperty("经度")
    private Double longitude;
    /**
     * 基站名称
     */
    @ApiModelProperty("基站名称")
    private String name;
    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private String address;
    /**
     * 离地高度
     */
    @ApiModelProperty("离地高度")
    private String high;
    /**
     * 天线支架类型
     */
    @ApiModelProperty("天线支架类型")
    private String type;
    /**
     * 天线数量
     */
    @ApiModelProperty("天线数量")
    private Double nums;
    /**
     * 运行状态
     */
    @ApiModelProperty("运行状态")
    private String status;
    /**
     * 发射机型号
     */
    @ApiModelProperty("发射机型号")
    private String model;
    /**
     * 天线下倾角（机械下倾角+电子下倾角）
     */
    @ApiModelProperty("天线下倾角（机械下倾角+电子下倾角）")
    private String antenna;
    /**
     * 区域
     */
    @ApiModelProperty("区域")
    private String region;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getNums() {
        return nums;
    }

    public void setNums(Double nums) {
        this.nums = nums;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAntenna() {
        return antenna;
    }

    public void setAntenna(String antenna) {
        this.antenna = antenna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

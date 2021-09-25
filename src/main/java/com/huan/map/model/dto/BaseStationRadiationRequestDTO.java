package com.huan.map.model.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * BaseStationRadiation
 *
 * @author yan
 * @date 2021/9/24
 */
public class BaseStationRadiationRequestDTO {
    /**
     * 纬度
     */
    @ApiModelProperty("纬度")
    Double latitude; //纬度
    /**
     * 经度
     */
    @ApiModelProperty("经度")
    Double longitude;
    /**
     * 地址
     */
    @ApiModelProperty("地址")
    String address;
    /**
     * 距离基站中心水平距离
     */
    @ApiModelProperty("距离基站中心水平距离")
    Integer distance;
    /**
     * 平均值
     */
    @ApiModelProperty("平均值")
    Double average;
    /**
     * 功率密度
     */
    @ApiModelProperty("功率密度")
    Double powerDensity;
    /**
     * 运营商
     */
    @ApiModelProperty("运营商")
    String provider;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getPowerDensity() {
        return powerDensity;
    }

    public void setPowerDensity(Double powerDensity) {
        this.powerDensity = powerDensity;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}

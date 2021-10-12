package com.huan.map.model.dto;

import com.huan.map.model.BaseStationRadiation;
import lombok.Data;

import java.util.List;

@Data
public class PageBaseStationRadiation {
    private List<BaseStationRadiation> allBaseStationRadiation;
    private Integer total;
    private Integer pageNo;
    private Integer size;

}

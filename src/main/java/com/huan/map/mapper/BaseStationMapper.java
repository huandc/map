package com.huan.map.mapper;

import com.huan.map.model.BaseStation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 郇冲
 * @Date 2021/9/4
 */
@Mapper
@Repository
public interface BaseStationMapper {
    List<BaseStation> findAll();
}

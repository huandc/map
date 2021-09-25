package com.huan.map.mapper;

import com.huan.map.model.Base;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Base
 *
 * @author yan
 * @date 2021/9/24
 */
@Mapper
@Repository
public interface BaseMapper {
    int addBase(@Param("address") String address, @Param("latitude") Double latitude, @Param("longitude") Double longitude);

    int updateBase(@Param("address") String address, @Param("latitude") Double latitude, @Param("longitude") Double longitude);

    int deleteBase(@Param("latitude") Double latitude, @Param("longitude") Double longitude);

    Base getBase(@Param("address") String address, @Param("latitude") Double latitude, @Param("longitude") Double longitude);
}

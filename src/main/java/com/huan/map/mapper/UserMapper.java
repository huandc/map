package com.huan.map.mapper;

import com.huan.map.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户
 *
 * @author yan
 * @date 2021/9/26
 */
@Mapper
@Repository
public interface UserMapper {
    List<User> listUser(@Param("user") String user);
}

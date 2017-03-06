package com.yanmw;

import com.yanmw.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by tedu on 2017/2/28.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name=#{name}")
    public User findUserByName(@Param("name") String name);
}

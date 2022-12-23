package com.dawn.mapper;

import com.dawn.pojo.Cloud;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CloudMapper {
    @Select("SELECT * FROM `key` WHERE id = #{id}")
    Cloud selectById(Long id);

    @Select("SELECT * FROM `key`")
    List<Cloud> selectAll();
}

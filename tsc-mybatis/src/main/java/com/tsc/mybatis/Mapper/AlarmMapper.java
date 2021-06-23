package com.tsc.mybatis.Mapper;

import com.tsc.mybatis.Pojo.AlarmInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AlarmMapper {
    @Select("select * from tsc_intiative_alarm_info")
    public List<AlarmInfo> findAll();
}


package com.emr.dao;

import com.emr.pojo.RP;
import com.emr.pojo.RPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RPMapper {
    long countByExample(RPExample example);

    int deleteByExample(RPExample example);

    int insert(RP record);

    int insertSelective(RP record);

    List<RP> selectByExample(RPExample example);

    int updateByExampleSelective(@Param("record") RP record, @Param("example") RPExample example);

    int updateByExample(@Param("record") RP record, @Param("example") RPExample example);
}
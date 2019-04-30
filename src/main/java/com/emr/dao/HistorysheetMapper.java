package com.emr.dao;

import com.emr.pojo.Historysheet;
import com.emr.pojo.HistorysheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistorysheetMapper {
    long countByExample(HistorysheetExample example);

    int deleteByExample(HistorysheetExample example);

    int insert(Historysheet record);

    int insertSelective(Historysheet record);

    List<Historysheet> selectByExample(HistorysheetExample example);

    int updateByExampleSelective(@Param("record") Historysheet record, @Param("example") HistorysheetExample example);

    int updateByExample(@Param("record") Historysheet record, @Param("example") HistorysheetExample example);
}
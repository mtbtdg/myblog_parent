package cn.zxJava.mapper;

import cn.zxJava.model.DailySpeech;
import cn.zxJava.model.DailySpeechExample;
import cn.zxJava.model.DailySpeechWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DailySpeechMapper {
    int countByExample(DailySpeechExample example);

    int deleteByExample(DailySpeechExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DailySpeechWithBLOBs record);

    int insertSelective(DailySpeechWithBLOBs record);

    List<DailySpeechWithBLOBs> selectByExampleWithBLOBs(DailySpeechExample example);

    List<DailySpeech> selectByExample(DailySpeechExample example);

    DailySpeechWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DailySpeechWithBLOBs record, @Param("example") DailySpeechExample example);

    int updateByExampleWithBLOBs(@Param("record") DailySpeechWithBLOBs record, @Param("example") DailySpeechExample example);

    int updateByExample(@Param("record") DailySpeech record, @Param("example") DailySpeechExample example);

    int updateByPrimaryKeySelective(DailySpeechWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DailySpeechWithBLOBs record);

    int updateByPrimaryKey(DailySpeech record);
}
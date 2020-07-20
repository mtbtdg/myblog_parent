package cn.zxJava.mapper;

import cn.zxJava.domain.DailySpeech;
import cn.zxJava.domain.DailySpeechExample;
import cn.zxJava.domain.DailySpeechWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
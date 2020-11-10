package cn.zxJava.mapper;

import cn.zxJava.model.Archives;
import cn.zxJava.model.ArchivesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArchivesMapper {
    int countByExample(ArchivesExample example);

    int deleteByExample(ArchivesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Archives record);

    int insertSelective(Archives record);

    List<Archives> selectByExample(ArchivesExample example);

    Archives selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Archives record, @Param("example") ArchivesExample example);

    int updateByExample(@Param("record") Archives record, @Param("example") ArchivesExample example);

    int updateByPrimaryKeySelective(Archives record);

    int updateByPrimaryKey(Archives record);
}
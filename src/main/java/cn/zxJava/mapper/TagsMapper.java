package cn.zxJava.mapper;

import cn.zxJava.model.Tags;
import cn.zxJava.model.TagsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagsMapper {
    int countByExample(TagsExample example);

    int deleteByExample(TagsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tags record);

    int insertSelective(Tags record);

    List<Tags> selectByExample(TagsExample example);

    Tags selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByExample(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);
}
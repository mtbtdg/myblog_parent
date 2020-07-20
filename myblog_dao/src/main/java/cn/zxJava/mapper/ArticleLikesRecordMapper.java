package cn.zxJava.mapper;

import cn.zxJava.domain.ArticleLikesRecord;
import cn.zxJava.domain.ArticleLikesRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleLikesRecordMapper {
    int countByExample(ArticleLikesRecordExample example);

    int deleteByExample(ArticleLikesRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleLikesRecord record);

    int insertSelective(ArticleLikesRecord record);

    List<ArticleLikesRecord> selectByExample(ArticleLikesRecordExample example);

    ArticleLikesRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleLikesRecord record, @Param("example") ArticleLikesRecordExample example);

    int updateByExample(@Param("record") ArticleLikesRecord record, @Param("example") ArticleLikesRecordExample example);

    int updateByPrimaryKeySelective(ArticleLikesRecord record);

    int updateByPrimaryKey(ArticleLikesRecord record);
}
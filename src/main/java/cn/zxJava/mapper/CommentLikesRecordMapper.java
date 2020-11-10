package cn.zxJava.mapper;

import cn.zxJava.model.CommentLikesRecord;
import cn.zxJava.model.CommentLikesRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentLikesRecordMapper {
    int countByExample(CommentLikesRecordExample example);

    int deleteByExample(CommentLikesRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommentLikesRecord record);

    int insertSelective(CommentLikesRecord record);

    List<CommentLikesRecord> selectByExample(CommentLikesRecordExample example);

    CommentLikesRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommentLikesRecord record, @Param("example") CommentLikesRecordExample example);

    int updateByExample(@Param("record") CommentLikesRecord record, @Param("example") CommentLikesRecordExample example);

    int updateByPrimaryKeySelective(CommentLikesRecord record);

    int updateByPrimaryKey(CommentLikesRecord record);
}
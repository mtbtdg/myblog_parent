package cn.zxJava.mapper;

import cn.zxJava.model.Friendlink;
import cn.zxJava.model.FriendlinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FriendlinkMapper {
    int countByExample(FriendlinkExample example);

    int deleteByExample(FriendlinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Friendlink record);

    int insertSelective(Friendlink record);

    List<Friendlink> selectByExample(FriendlinkExample example);

    Friendlink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Friendlink record, @Param("example") FriendlinkExample example);

    int updateByExample(@Param("record") Friendlink record, @Param("example") FriendlinkExample example);

    int updateByPrimaryKeySelective(Friendlink record);

    int updateByPrimaryKey(Friendlink record);
}
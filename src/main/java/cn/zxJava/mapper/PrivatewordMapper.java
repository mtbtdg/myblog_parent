package cn.zxJava.mapper;

import cn.zxJava.model.Privateword;
import cn.zxJava.model.PrivatewordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrivatewordMapper {
    int countByExample(PrivatewordExample example);

    int deleteByExample(PrivatewordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Privateword record);

    int insertSelective(Privateword record);

    List<Privateword> selectByExample(PrivatewordExample example);

    Privateword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Privateword record, @Param("example") PrivatewordExample example);

    int updateByExample(@Param("record") Privateword record, @Param("example") PrivatewordExample example);

    int updateByPrimaryKeySelective(Privateword record);

    int updateByPrimaryKey(Privateword record);
}
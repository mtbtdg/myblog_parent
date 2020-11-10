package cn.zxJava.mapper;

import cn.zxJava.model.Categories;
import cn.zxJava.model.CategoriesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoriesMapper {
    int countByExample(CategoriesExample example);

    int deleteByExample(CategoriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Categories record);

    int insertSelective(Categories record);

    List<Categories> selectByExample(CategoriesExample example);

    Categories selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByPrimaryKeySelective(Categories record);

    int updateByPrimaryKey(Categories record);
}
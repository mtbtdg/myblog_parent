package cn.zxJava.service.impl;

import cn.zxJava.mapper.ArticleMapper;
import cn.zxJava.model.Article;
import cn.zxJava.service.IndexService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.service.impl
 * @Description: 网站主页业务实现类
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-09 23:15:02
 */
@Service
@Transactional
public class IndexServiceImpl implements IndexService {
    @Autowired
    private ArticleMapper articleMapper;

    /**
        * @param pageNum:当前页码
    	* @param pageSize:每页展示数量
        * @return com.github.pagehelper.PageInfo<cn.zxJava.model.Article> 
        * @author zx
        * @date 2020/11/9 0009 23:18
    */
    @Override
    public PageInfo<Article> findPage(int pageNum, int pageSize) {
        //设置当前页和分页条数
        PageHelper.startPage(pageNum,pageSize);
        //查询所有，自动分页
        List<Article> list = articleMapper.selectByExample(null);
        //封装数据
        return new PageInfo<>(list);
    }
}

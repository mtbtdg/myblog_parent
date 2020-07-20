package cn.zxJava.service.impl;

import cn.zxJava.domain.Article;
import cn.zxJava.mapper.ArticleMapper;
import cn.zxJava.service.ArticleService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * @Param pageNum: 当前页码
     * @Param pageSize: 每页展示数量
     * @return: com.github.pagehelper.PageInfo<cn.zxJava.domain.Article>
     * @Author: 湛翔
     * @Date: 2020/7/21 0021
     */
    @Override
    public PageInfo<Article> findPage(int pageNum, int pageSize) {
        //设置当前页和分页条数
        PageHelper.startPage(pageNum,pageSize);
        //查询所有，自动分页
        List<Article> list = articleMapper.findAll();

        for (Article article : list) {
            System.out.println(article.getArticletitle());
        }
        //封装数据
        return new PageInfo<>(list);

    }

}

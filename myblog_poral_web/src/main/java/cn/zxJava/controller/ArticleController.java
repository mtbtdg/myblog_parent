package cn.zxJava.controller;

import cn.zxJava.domain.Article;
import cn.zxJava.entity.Result;
import cn.zxJava.service.ArticleService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Reference
    private ArticleService articleService;

    /**
     * @Param pageNum: 定义分页的页数
     * @Param pageSize: 定义分页的大小
     * @return: cn.zxJava.entity.Result
     * @Author: 湛翔
     * @Date: 2020/7/20

     */
    @RequestMapping("/findPage/{pageNum}/{pageSize}")
    public Result findPage (@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

        try {
            PageInfo<Article> pageInfo = articleService.findPage(pageNum,pageSize);

            return new Result(true,"操作成功",pageInfo.getTotal(),pageInfo.getList());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"操作成功");
        }
    }
}

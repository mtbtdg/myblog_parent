package cn.zxJava.controller;

import cn.zxJava.entity.Result;
import cn.zxJava.model.Article;
import cn.zxJava.service.IndexService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.controller
 * @Description: 主页控件
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-09 23:06:42
 */

@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private IndexService indexService;

    /**
        * @param pageNum:定义分页的页数
    	* @param pageSize:定义分页的大小
        * @return cn.zxJava.entity.Result 
        * @author zx
        * @date 2020/11/9 0009 23:21
    */
    @RequestMapping("/findPage/{pageNum}/{pageSize}")
    public Result findPage (@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        try {
            PageInfo<Article> pageInfo = indexService.findPage(pageNum,pageSize);
            return new Result(true,"操作成功",pageInfo.getTotal(),pageInfo.getList());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"操作失败");
        }
    }

}

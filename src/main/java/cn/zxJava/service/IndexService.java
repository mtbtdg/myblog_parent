package cn.zxJava.service;

import cn.zxJava.model.Article;
import com.github.pagehelper.PageInfo;

public interface IndexService {
    PageInfo<Article> findPage(int pageNum, int pageSize);
}

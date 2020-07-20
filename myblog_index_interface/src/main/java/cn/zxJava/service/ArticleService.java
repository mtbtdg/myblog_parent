package cn.zxJava.service;

import cn.zxJava.domain.Article;
import com.github.pagehelper.PageInfo;

public interface ArticleService {
    PageInfo<Article> findPage(int pageNum, int pageSize);
}

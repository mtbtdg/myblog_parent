package cn.zxJava.service;

import cn.zxJava.model.Article;
import cn.zxJava.model.User;
import com.github.pagehelper.PageInfo;

public interface IndexService {
    PageInfo<Article> findPage(int pageNum, int pageSize);

    User findLoginMessage(String loginPhone);
}

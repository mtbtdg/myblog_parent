package cn.zxJava.service;

import cn.zxJava.entity.UserEntity;
import cn.zxJava.model.User;

public interface LoginService {

    UserEntity findUserLogin(String phone);

    void updateRecentlyLanded(User user, String recentlyLanded);
}

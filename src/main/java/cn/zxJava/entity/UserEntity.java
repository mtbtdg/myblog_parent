package cn.zxJava.entity;

import cn.zxJava.model.Role;
import cn.zxJava.model.User;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.entity
 * @Description: 用户组合类
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-12 16:11:23
 */
@Data
public class UserEntity {
    private User user;
    private List<Role> roles;

    public UserEntity() {
    }

    public UserEntity(User user, List<Role> roles) {
        this.user = user;
        this.roles = roles;
    }
}

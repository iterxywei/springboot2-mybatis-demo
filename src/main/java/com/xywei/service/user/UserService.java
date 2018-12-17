package com.xywei.service.user;

import com.github.pagehelper.PageInfo;
import com.xywei.model.User;

public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}

package com.wyjson.router.helper.module_user.service;

import androidx.annotation.Nullable;
import com.wyjson.module_common.route.service.user.UserService;
import com.wyjson.router.GoRouter;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY GOROUTER.
 * 用户服务
 * {@link com.wyjson.module_user.route.service.UserServiceImpl}
 */
public class UserServiceGoRouter {
    @Nullable
    public static UserService get() {
        return GoRouter.getInstance().getService(UserService.class);
    }
}

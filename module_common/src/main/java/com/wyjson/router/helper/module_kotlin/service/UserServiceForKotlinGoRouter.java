package com.wyjson.router.helper.module_kotlin.service;

import androidx.annotation.Nullable;
import com.wyjson.module_common.route.service.user.UserService;
import com.wyjson.router.GoRouter;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY GOROUTER.
 * Kotlin模块用户服务
 * {@link com.wyjson.module_kotlin.route.service.KotlinUserServiceImpl}
 */
public class UserServiceForKotlinGoRouter {
    @Nullable
    public static UserService get() {
        return GoRouter.getInstance().getService(UserService.class, "Kotlin");
    }
}

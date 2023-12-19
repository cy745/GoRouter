package com.wyjson.router.helper.module_main.group_main;

import android.content.Context;
import com.wyjson.router.GoRouter;
import com.wyjson.router.model.Card;
import com.wyjson.router.model.CardMeta;
import java.lang.String;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY GOROUTER.
 * 主页
 * {@link com.wyjson.module_main.activity.MainActivity}
 */
public class MainActivityGoRouter {
    public static String getPath() {
        return "/main/activity";
    }

    public static CardMeta getCardMeta() {
        return GoRouter.getInstance().build(getPath()).getCardMeta();
    }

    public static Card build() {
        return GoRouter.getInstance().build(getPath());
    }

    public static void go(Context context) {
        build().go(context);
    }
}

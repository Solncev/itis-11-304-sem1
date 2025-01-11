package com.solncev.chat.view;

import com.solncev.chat.ChatApplication;
import javafx.scene.Parent;

public abstract class BaseView {

    private static ChatApplication application;

    public static ChatApplication getApplication() {
        if (application != null) {
            return application;
        }
        throw new RuntimeException("application is null");
    }

    public static void setApplication(ChatApplication application) {
        BaseView.application = application;
    }

    public abstract Parent getView();
}

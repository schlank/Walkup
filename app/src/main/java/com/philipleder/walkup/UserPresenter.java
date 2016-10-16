package com.philipleder.walkup;

import android.util.Log;
import android.view.View;

public class UserPresenter {
    private boolean visible = false;

    public boolean isVisible() {
        return visible;
    }

    void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void onSubmit(View view, User user) {
        Log.e("View: ", view.toString());
        Log.e("user: ", user.getLanId());
    }

    public void onScreenClick(View view, User user) {
        Log.e("onScreenClick View: ", view.toString());
        Log.e("user: ", user.getLanId());

    }
}

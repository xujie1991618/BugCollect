package com.crayfish.bugcollect;

import android.app.Application;

import com.crayfish.bugcollect.utils.CrashHandler;

/**
 * 作者：crayfish(徐杰)
 * 描述：
 * Created by crayfish on 2017/5/10.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}

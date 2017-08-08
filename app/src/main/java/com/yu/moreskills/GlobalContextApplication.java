package com.yu.moreskills;

import android.app.Application;
import android.content.Context;

/**
 * Created by D22436 on 2017/8/8.
 */

public class GlobalContextApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }


    /**
     * 获取全局上下文对象
     * @return
     */
    public  static Context getGlobalContext() {
        return context;
    }
}

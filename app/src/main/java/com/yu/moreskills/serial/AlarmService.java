package com.yu.moreskills.serial;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/**
 * Created by D22436 on 2017/8/8.
 */

public class AlarmService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        }.start();

        // 获取AlarmManager
        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        long triggerAtMillis = SystemClock.elapsedRealtime() + 60 * 60 * 1000; // 系统启动的时间+1小时
        Intent i=new Intent(this, AlarmService.class);
        PendingIntent opeation = PendingIntent.getActivity(this,1, i, PendingIntent.FLAG_ONE_SHOT);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtMillis,opeation);

        return super.onStartCommand(intent, flags, startId);
        
    }
}

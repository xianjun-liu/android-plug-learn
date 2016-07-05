package com.dx168.dexloader;

import android.app.Application;
import android.content.Context;
import android.support.multidex2.MultiDex;
import android.util.Log;

/**
 * Created by tong on 16/7/4.
 */
public class App extends Application {
    private static final String TAG = App.class.getSimpleName();

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        MultiDex.install(this);

        ClassLoader classLoader = getClassLoader();
        Log.d(TAG,classLoader.toString());
    }
}

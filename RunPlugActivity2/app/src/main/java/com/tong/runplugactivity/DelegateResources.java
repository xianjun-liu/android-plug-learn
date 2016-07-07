package com.tong.runplugactivity;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by tong on 16/7/7.
 */
public class DelegateResources extends Resources {
    public DelegateResources(AssetManager assets, DisplayMetrics metrics, Configuration config) {
        super(assets, metrics, config);
    }


}

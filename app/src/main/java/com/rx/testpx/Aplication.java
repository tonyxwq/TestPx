package com.rx.testpx;

import android.app.Application;

/**
 * Author:XWQ
 * Time   2018/12/24
 * Descrition: this is Aplication
 */

public class Aplication extends Application
{
    private static Aplication instance;

    @Override
    public void onCreate()
    {
        super.onCreate();
        instance = this;
    }

    public static Aplication getInstance()
    {
        return instance;
    }
}

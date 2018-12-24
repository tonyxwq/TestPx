/*
package com.rx.testpx;

import android.util.DisplayMetrics;
import android.util.Log;

*/
/**
 * Author:XWQ
 * Time   2018/12/24
 * Descrition: this is r
 *//*


public class r
{
    DisplayMetrics metrics = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(metrics);
    int screenHeight = metrics.heightPixels;//屏幕高度像素
    int screenWidth = metrics.widthPixels;//屏幕宽度像素

        Log.d("data","screenWidth"+screenWidth);
        Log.d("data","screenHeight"+screenHeight);

    //density = densityDpi / 160
    float density = metrics.density;// "屏幕密度比"（0.75 / 1.0 / 1.5）
    int densityDpi = metrics.densityDpi;// 屏幕像素密度dpi（120 / 160 / 240）每一英寸的屏幕所包含的像素数.值越高的设备，其屏幕显示画面的效果也就越精细
    // 屏幕宽度算法:屏幕宽度（像素）/"屏幕密度"   px = dp * (dpi / 160)
    int height = (int) (screenHeight / density);//屏幕高度dp

        Log.d("data","density"+density);
        Log.d("data","densityDpi"+densityDpi);
        Log.d("data","height"+height);

    //12-24 14:01:39.269 12682-12682/? D/data: screenWidth720
    //12-24 14:01:39.269 12682-12682/? D/data: screenHeight1280
    //12-24 14:01:39.269 12682-12682/? D/data: density2.0
    //12-24 14:01:39.269 12682-12682/? D/data: densityDpi320 360
    //12-24 14:01:39.269 12682-12682/? D/data: height640



    //12-24 14:20:52.493 7163-7163/com.rx.testpx D/data: screenWidth1080
    //12-24 14:20:52.494 7163-7163/com.rx.testpx D/data: screenHeight2032
    //12-24 14:20:52.494 7163-7163/com.rx.testpx D/data: density 3.0
    //12-24 14:20:52.494 7163-7163/com.rx.testpx D/data: densityDpi 480  360
    //12-24 14:20:52.494 7163-7163/com.rx.testpx D/data: height677
}
*/

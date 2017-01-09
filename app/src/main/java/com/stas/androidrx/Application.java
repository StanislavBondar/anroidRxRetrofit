package com.stas.androidrx;

import com.stas.androidrx.retrofit.RetrofitSingleton;

/**
 * @author Stas
 * @since 09.01.17.
 */

public class Application extends android.app.Application {


    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitSingleton.init();
    }
}

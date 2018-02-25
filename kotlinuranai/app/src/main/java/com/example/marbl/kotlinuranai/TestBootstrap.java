package com.example.marbl.kotlinuranai;

/**
 * Created by marbl on 2018/02/12.
 */
import android.app.Application;
import com.beardedhen.androidbootstrap.TypefaceProvider;

public class TestBootstrap extends Application  {
        public void onCreate() {
             super.onCreate();
            TypefaceProvider.registerDefaultIconSets();
        }
}

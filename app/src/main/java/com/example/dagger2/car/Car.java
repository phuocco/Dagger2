package com.example.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    @Inject Engine engine;
    @Inject Wheels wheels;

    @Inject
    public Car() {

    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    
    public void drive(){
        engine.start();
        Log.d(TAG, "drive: ");
    }
}

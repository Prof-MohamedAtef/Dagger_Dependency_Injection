package mo.atef.dagger.daggerapp;

import android.util.Log;

import javax.inject.Inject;

import mo.atef.dagger.daggerapp.dublicates.Engine;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;

    private Wheels wheels;

    @Inject
    public Car(mo.atef.dagger.daggerapp.dublicates.Engine engine, Wheels wheels) {
        this.engine=engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "driving...");
    }
}

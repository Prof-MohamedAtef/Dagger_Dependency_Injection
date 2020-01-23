package mo.atef.dagger.daggerapp;

import android.util.Log;

import javax.inject.Inject;

import mo.atef.dagger.daggerapp.dublicates.Engine;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    @Inject
    public PetrolEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started");
    }
}

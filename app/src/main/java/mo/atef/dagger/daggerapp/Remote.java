package mo.atef.dagger.daggerapp;

import android.app.Activity;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class Remote {

    public void setListener(Car car){
        Log.d(TAG, "Remote Connected");
    }
}

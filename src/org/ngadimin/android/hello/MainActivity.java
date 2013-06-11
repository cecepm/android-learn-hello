package org.ngadimin.android.hello;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;

import org.ngadimin.android.hello.Constants;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        if (BuildConfig.DEBUG) {
            Log.d(Constants.LOG, "onCreated called");
        }
        
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

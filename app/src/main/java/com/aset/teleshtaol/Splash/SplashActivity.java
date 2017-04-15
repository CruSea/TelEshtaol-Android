package com.aset.teleshtaol.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aset.teleshtaol.MainActivity;

/**
 * Created by AmanS on 4/7/2017.
 */

public class SplashActivity extends AppCompatActivity {

    //loads splash first and redirects to main activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

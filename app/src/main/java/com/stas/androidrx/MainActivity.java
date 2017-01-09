package com.stas.androidrx;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.stas.androidrx.fragment.ModelsListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragmentHotelsList = getSupportFragmentManager().findFragmentById(R.id.container);
        if (fragmentHotelsList == null) {
            fragmentHotelsList = new ModelsListFragment();
            getSupportFragmentManager().
                    beginTransaction().add(R.id.container, fragmentHotelsList)
                    .commit();
        }
    }

}
package com.example.dmitry.serviceexample.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dmitry.serviceexample.R;
import com.example.dmitry.serviceexample.events.StartServiceEvent;
import com.example.dmitry.serviceexample.events.StopServiceEvent;
import com.example.dmitry.serviceexample.service.PlayService;
import com.example.dmitry.serviceexample.ui.base.BaseActivity;
import com.squareup.otto.Subscribe;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null)
            getFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();
    }


    @Subscribe
    public void onStartServiceEvent(StartServiceEvent event) {
        startService(new Intent(MainActivity.this, PlayService.class));
    }

    @Subscribe
    public void onStopServiceEvent(StopServiceEvent event) {
        stopService(new Intent(MainActivity.this, PlayService.class));
    }
}

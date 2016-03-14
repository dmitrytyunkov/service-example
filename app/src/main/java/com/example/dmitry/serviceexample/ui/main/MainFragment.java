package com.example.dmitry.serviceexample.ui.main;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dmitry.serviceexample.R;
import com.example.dmitry.serviceexample.events.StartServiceEvent;
import com.example.dmitry.serviceexample.events.StopServiceEvent;
import com.example.dmitry.serviceexample.ui.base.BaseFragment;

import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @OnClick(R.id.play_button)
    public void onPlayButtonClick() {
        getBus().post(new StartServiceEvent());
    }

    @OnClick(R.id.stop_button)
    public void onStopButtonClick() {
        getBus().post(new StopServiceEvent());
    }
}

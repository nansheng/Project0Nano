package com.learn.lonejourneyman.sunshine00;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//import android.support.design.widget.Snackbar;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */


public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button button1 = (Button) getActivity().findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getContext(),"This button will launch Spotify Streamer",Toast.LENGTH_SHORT).show();

                /*
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                */
            }
        });

        Button button2 = (Button) getActivity().findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getContext(),"This button will launch Scores App",Toast.LENGTH_SHORT).show();
            }
        });

        Button button3 = (Button) getActivity().findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getContext(),"This button will launch Library App",Toast.LENGTH_SHORT).show();
            }
        });

        Button button4 = (Button) getActivity().findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getContext(),"This button will launch Build It Bigger",Toast.LENGTH_SHORT).show();
            }
        });

        Button button5 = (Button) getActivity().findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getContext(),"This button will launch XYZ Reader",Toast.LENGTH_SHORT).show();
            }
        });

        Button button6 = (Button) getActivity().findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getContext(),"This button will launch my capstone app",Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
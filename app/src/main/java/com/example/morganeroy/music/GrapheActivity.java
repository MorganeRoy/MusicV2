package com.example.morganeroy.music;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import java.io.IOException;
import java.util.Random;
import java.util.Set;

import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.Toast;

/**
 * Created by MorganeRoy on 11/01/2017.
 */



public class GrapheActivity extends Activity{
    private GrapheView grapheView;
    private int val;
    private Handler myHandler;
    private boolean isTerminationConditionMet = false;
    private int[] tab;
    Random random = new Random();

    BluetoothAdapter blueAdapter = BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        grapheView = new GrapheView(this, 100);


        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                /*Toast.makeText(getApplicationContext(), "seconds remaining: " + millisUntilFinished / 1000,
                        Toast.LENGTH_SHORT).show();*/
                graphe();
            }

            public void onFinish() {
                Intent option = new Intent(GrapheActivity.this, MainActivity.class);
                startActivity(option);
            }
        }.start();


        setContentView(grapheView);

    }


    public void graphe(){
        grapheView.clear();

        for(int i = 0; i < 100; i++) {
            val = random.nextInt(25 - 5)+5;
           // tab[i] = val;
            grapheView.addGraphPoint(val);
        }
        setContentView(grapheView);

    }



}



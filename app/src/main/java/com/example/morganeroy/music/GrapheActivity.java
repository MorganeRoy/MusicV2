package com.example.morganeroy.music;

import android.app.Activity;
import android.os.Bundle;

import java.util.Random;

/**
 * Created by MorganeRoy on 11/01/2017.
 */

public class GrapheActivity extends Activity{
    private GrapheView grapheView;
    private int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        grapheView = new GrapheView(this, 100);
        Random random = new Random();
        for (int i = 0; i < 100; ++i) {
            val = random.nextInt(25 - 5);
            grapheView.addGraphPoint(val);
        }
        //grapheView.addGraphPoint(11);
        //grapheView.addGraphPoint(32);
        setContentView(grapheView);


    }

}

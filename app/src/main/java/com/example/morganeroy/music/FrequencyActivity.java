package com.example.morganeroy.music;

import android.app.Activity;
import android.os.Bundle;

import com.example.morganeroy.music.Database.SongBDD;

public class FrequencyActivity extends Activity {


    SongBDD bdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency);

        bdd = new SongBDD(this);

        //On ouvre la base de données pour écrire dedans
        bdd.open();


    }
}

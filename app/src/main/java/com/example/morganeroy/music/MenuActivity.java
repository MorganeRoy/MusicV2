package com.example.morganeroy.music;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

    private Button musicButton;
    private Button optionButton;
    private Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        musicButton = (Button) findViewById(R.id.button_music);
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(main);
            }
        });

        optionButton = (Button) findViewById(R.id.button_option);
        optionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent option = new Intent(MenuActivity.this, OptionActivity.class);
                startActivity(option);
            }
        });

        testButton = (Button) findViewById(R.id.button_test);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent option = new Intent(MenuActivity.this, OptionActivity.class);
                startActivity(option);
            }
        });

    }
}

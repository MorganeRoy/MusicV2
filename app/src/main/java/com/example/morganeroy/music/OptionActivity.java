package com.example.morganeroy.music;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionActivity extends Activity {

    private Button retourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        retourButton = (Button) findViewById(R.id.button_retour);
        retourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(OptionActivity.this, MenuActivity.class);
                startActivity(menu);
            }
        });
    }
}

package com.example.fancy.internetwifi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSet = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSet = (Button)findViewById(R.id.btnSetting);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentSet = new Intent();
                IntentSet.setClass(MainActivity.this,InternetChoice.class);
                MainActivity.this.startActivity(IntentSet);
            }
        });
    }
}

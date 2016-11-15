package com.example.andres.anzarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstTextView = (TextView) findViewById(R.id.editText);

        Button firstButton = (Button) findViewById(R.id.firstButton);

        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                firstTextView.setText("You Clicked");
            }
        });
    }
}

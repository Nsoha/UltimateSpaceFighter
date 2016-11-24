package com.nick.ultimatespacefighter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class End extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);


        Intent i = getIntent();
        int newScore = i.getIntExtra("int", -1);
        TextView score = (TextView) findViewById(R.id.score);
        score.setText(Integer.toString(newScore));



    }



    public void startMenu(View v) {
        Intent intent = new Intent(this,StartMenu.class);
        startActivity(intent);
    }
}

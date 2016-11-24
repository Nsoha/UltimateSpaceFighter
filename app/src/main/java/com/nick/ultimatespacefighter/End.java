package com.nick.ultimatespacefighter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
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

        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        int highScore = prefs.getInt("score", 0);
        TextView HighScore = (TextView) findViewById(R.id.hScore);
        if (highScore > newScore) {
            HighScore.setText(Integer.toString(highScore));
        } else {
            highScore = newScore;
            HighScore.setText(Integer.toString(highScore));
            prefs.edit().putInt("score", highScore).apply();
        }



    }



    public void startMenu(View v) {
        Intent intent = new Intent(this,StartMenu.class);
        startActivity(intent);
    }
}

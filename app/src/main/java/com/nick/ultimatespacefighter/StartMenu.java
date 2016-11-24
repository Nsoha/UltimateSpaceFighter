package com.nick.ultimatespacefighter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartMenu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);

        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        int highScore = prefs.getInt("score", 0);
        TextView HighScore = (TextView) findViewById(R.id.highscore);
        HighScore.setText(Integer.toString(highScore));




    }

    public void singlePlayer(View v) {
        Intent intent = new Intent(this,singlePlayer.class);
        startActivity(intent);
    }

    public void doublePlayer(View v) {
        Intent intent = new Intent(this,doublePlayer.class);
        startActivity(intent);
    }

}

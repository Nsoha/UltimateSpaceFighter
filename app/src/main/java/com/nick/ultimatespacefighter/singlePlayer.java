package com.nick.ultimatespacefighter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class singlePlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
    }


    public void singlePlayerGame(View v) {
        Intent intent = new Intent(this,singlePlayerGame.class);
        startActivity(intent);
    }



}

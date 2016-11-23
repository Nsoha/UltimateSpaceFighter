package com.nick.ultimatespacefighter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
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

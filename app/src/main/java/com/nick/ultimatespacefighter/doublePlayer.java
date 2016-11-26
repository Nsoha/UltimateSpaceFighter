package com.nick.ultimatespacefighter;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Set;

public class doublePlayer extends AppCompatActivity {
    BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_player);

    }



public void scan(View view) {

    Intent intent = new Intent(this,doublePlayerOne.class);
    startActivity(intent);

}




    public void recieve(View view){


        Intent intent = new Intent(this,doublePlayerTwo.class);
        startActivity(intent);

    }






}

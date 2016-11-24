package com.nick.ultimatespacefighter;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class doublePlayer extends AppCompatActivity {
    BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_player);

    }



public void scan(){
    if (!mBluetoothAdapter.isEnabled()) {
        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
       // startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
    }


    }



}

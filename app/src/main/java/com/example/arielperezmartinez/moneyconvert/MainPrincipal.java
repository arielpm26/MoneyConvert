package com.example.arielperezmartinez.moneyconvert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        Thread timeTread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(MainPrincipal.this, MainCalculos.class);
                    startActivity(intent);
                }
            }
        };
        timeTread.start();

    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
    }


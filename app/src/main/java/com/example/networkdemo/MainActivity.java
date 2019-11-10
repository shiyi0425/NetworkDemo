package com.example.networkdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_frame;
    private Button btn_tween;
    private Button btn_receive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tween = findViewById(R.id.btn_tween);
        btn_frame = findViewById(R.id.btn_frame);
        btn_receive = findViewById(R.id.btn_receive);

        btn_tween.setOnClickListener(this);
        btn_frame.setOnClickListener(this);
        btn_receive.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_tween:
                Intent intent=new Intent(MainActivity.this,URLConnectionActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_frame:
                intent=new Intent(MainActivity.this,OkHttpActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_receive:
                intent=new Intent(MainActivity.this,OkHttpActivity.class);
                startActivity(intent);
                break;


        }



    }
}

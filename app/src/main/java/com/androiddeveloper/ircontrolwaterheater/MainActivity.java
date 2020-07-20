package com.androiddeveloper.ircontrolwaterheater;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androiddeveloper.ircontrolwaterheater.ir.IRUtil;

public class MainActivity extends AppCompatActivity {
    private TextView tv_state;
    private Button btn_open;
    private Button btn_close;
    private Button btn_heat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean hasIrEmitter = IRUtil.init(this);
        if (!hasIrEmitter) {
            startActivity(new Intent(this, NoIrActivity.class));
            finish();
        }
        initViews();
        setClickListener();

    }

    private void initViews() {
        tv_state = findViewById(R.id.tv_state);
        btn_open = findViewById(R.id.btn_open);
        btn_close = findViewById(R.id.btn_close);
        btn_heat = findViewById(R.id.btn_heat);
    }

    private void setClickListener() {
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IRUtil.sendOPEN();
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IRUtil.sendCLOSE();
            }
        });
        btn_heat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
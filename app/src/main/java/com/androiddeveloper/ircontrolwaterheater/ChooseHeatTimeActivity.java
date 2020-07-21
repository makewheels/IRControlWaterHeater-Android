package com.androiddeveloper.ircontrolwaterheater;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseHeatTimeActivity extends AppCompatActivity {
    private Button btn_heat_10min;
    private Button btn_heat_20min;
    private Button btn_heat_30min;
    private Button btn_heat_40min;
    private Button btn_heat_50min;
    private Button btn_heat_60min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_heat_time);

        initViews();
        addListeners();
    }

    private void initViews() {
        btn_heat_10min = findViewById(R.id.btn_heat_10min);
        btn_heat_20min = findViewById(R.id.btn_heat_20min);
        btn_heat_30min = findViewById(R.id.btn_heat_30min);
        btn_heat_40min = findViewById(R.id.btn_heat_40min);
        btn_heat_50min = findViewById(R.id.btn_heat_50min);
        btn_heat_60min = findViewById(R.id.btn_heat_60min);
    }

    private void addListeners() {
        final String keyName_heatTime = "heatTime";
        btn_heat_10min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(keyName_heatTime, 10);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        btn_heat_20min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(keyName_heatTime, 20);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        btn_heat_30min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(keyName_heatTime, 30);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        btn_heat_40min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(keyName_heatTime, 40);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        btn_heat_50min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(keyName_heatTime, 50);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        btn_heat_60min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(keyName_heatTime, 60);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}